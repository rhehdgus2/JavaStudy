package Chapter13;

import java.util.ArrayList;

//손님을 나타내는 클래스
class Customer2 implements Runnable {
	private Table2 table;
	private String food;
	
	// 생성자
	Customer2(Table2 table, String food) {
		this.table = table;
		this.food = food;
	}
	
	// 스레드 실행 메서드
	public void run() {
		while(true) {
			// 잠시 대기
			try { Thread.sleep(100); } catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}  // while
	}
}

//요리사를 나타내는 클래스
class Cook2 implements Runnable {
	private Table2 table;
	
	Cook2(Table2 table) { this.table = table; }  // 생성자
	
	// 스레드 실행 메서드
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			// 잠시 대기
			try { Thread.sleep(10); } catch(InterruptedException e) {}
		}  // while
	}
}

//음식을 담는 테이블을 나타내는 클래스
class Table2 {
	String[] dishNames = { "donut", "donut", "burger" };  // donut의 확률을 높인다.
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	// 음식을 추가하는 메서드 (동기화)
	public synchronized void add(String dish) {
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting. ");
			try {
				wait();  // COOK 쓰레드를 기다리게 한다.
				Thread.sleep(500);
			} catch(InterruptedException e) {}
		}
		dishes.add(dish);
		notify();  // 기다리고 있는 CUST를 깨우기 위함.
		System.out.println("Dishes : " + dishes.toString());
	}
	
	// 특정 음식을 제거하는 메서드 (동기화)
	public void remove(String dishName) {
		synchronized(this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting. ");
				try {
					wait();  // CUST 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}
			
			while(true) {
				for(int i = 0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i);
						notify();  // 잠자고 있는 COOK을 깨우기 위함
						return;
					}
				}  // for문의 끝
				
				try {
					System.out.println(name + " is waiting. ");
					wait();  // 원하는 음식이 없는 CUST 쓰레드를 기다리게 한다.
					Thread.sleep(500);
				} catch(InterruptedException e) {}
			}  // while(true)
		}  // synchronized
	}
	
	// 음식 종류의 수를 반환하는 메서드
	public int dishNum() { return dishNames.length; }
}

public class Example13_15 {
	public static void main(String[] args) throws Exception {
		Table2 table = new Table2();  // 여러 쓰레드가 공유하는 객체
		
		// 요리사 스레드 시작
		new Thread(new Cook2(table), "COOK").start();
		
		// 두 명의 손님 스레드 시작
		new Thread(new Customer2(table, "donut"), "CUST1").start();
		new Thread(new Customer2(table, "burger"), "CUST2").start();
		Thread.sleep(2000);  // 2초 동안 대기
		System.exit(0);  // 프로그램 종료
	}
}