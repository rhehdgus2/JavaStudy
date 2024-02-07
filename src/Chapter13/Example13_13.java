package Chapter13;

public class Example13_13 {
	public static void main(String[] args) {
		// RunnableEx13 객체 생성
		Runnable r = new RunnableEx13();
		// 새로운 스레드에서 실행
		new Thread(r).start();
		new Thread(r).start();
	}
}

class Account2 {
	// 잔고를 나타내는 변수, private으로 해야 동기화가 의미가 있다.
	private int balance = 1000;
	
	public int getBalance() {
		return balance;
	}
	
	public synchronized void withdraw(int money) {  // synchronized로 메서드를 동기화
		// 출금 가능한 경우
		if(balance >= money) {
			// 1초 동안 일시 정지
			try { Thread.sleep(1000); } catch(InterruptedException e) {}
			balance -= money;  // 출금
		}
	} // withdraw
}

class RunnableEx13 implements Runnable {
	// 공유 자원인 Account2 객체 생성
	Account2 acc = new Account2();
	
	public void run() {
		while(acc.getBalance() > 0) {
			// 100, 200, 300중의 한 값을 임의로 선택해서 출금(withdraw)
			int money = (int)(Math.random() * 3 + 1) * 100;
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalance());
		}
	} // run
}
