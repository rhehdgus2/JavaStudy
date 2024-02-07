package Chapter13;

import java.util.ArrayList;

// 손님을 나타내는 클래스
class Customer implements Runnable {
	private Table table;  // 테이블 객체 참조
	private String food;  // 먹을 음식
	
	// 생성자
	Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
	// 스레드 실행 메서드
	public void run() {
		while(true) {
			// 잠시 대기
			try { Thread.sleep(10); } catch(InterruptedException e) {}
			String name = Thread.currentThread().getName();
			
			if(eatFood())
				System.out.println(name + " ate a " + food);
			else
				System.out.println(name + " failed to eat. :(");
		}  // while
	}
	
	// 음식을 먹는 메서드
	boolean eatFood() { return table.remove(food); }
}

//요리사를 나타내는 클래스
class Cook implements Runnable {
	private Table table;  // 테이블 객체 참조
	
	// 생성자
	Cook(Table table) { this.table = table; }
	
	// 스레드 실행 메서드
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());  // 무작위 음식 선택
			table.add(table.dishNames[idx]);  // 테이블에 음식 추가
			// 잠시 대기
			try { Thread.sleep(100); } catch(InterruptedException e) {}
		}  // while
	}
}

//음식을 담는 테이블을 나타내는 클래스
class Table {
	String[] dishNames = { "donut", "donut", "burger" };  // 음식 종류
	final int MAX_FOOD = 6;  // 최대 음식 수
	private ArrayList<String> dishes = new ArrayList<>();  // 음식을 담는 리스트
	
	// 음식을 추가하는 메서드 (synchronized를 추가)
	public synchronized void add(String dish) {
		if(dishes.size() >= MAX_FOOD)
			return;  // 테이블이 가득 차 있으면 추가하지 않음
		dishes.add(dish);
		// 음식이 추가되면 현재 음식 상태 출력
		System.out.println("Dishes : " + dishes.toString());
	}
	
	// 특정 음식을 제거하는 메서드 (동기화)
	public boolean remove(String dishName) {
		synchronized(this) {
			while(dishes.size() == 0) {
				// 테이블에 음식이 없으면 대기하고 있는 스레드의 이름을 출력
				String name = Thread.currentThread().getName();
				System.out.println(name + " is waiting. ");
				// 0.5초 동안 대기
				try { Thread.sleep(500); } catch(InterruptedException e) {}
			}
			
			// 테이블에 음식이 있으면 해당 음식을 찾아 제거하고 성공 여부를 반환
			for(int i = 0; i < dishes.size(); i++)
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					return true;  // 제거 성공
				}
		}  // synchronized
		// 테이블에 해당 음식이 없거나 다른 스레드가 이미 제거한 경우
		return false;
	}
	
	// 음식 종류의 수를 반환하는 메서드
	public int dishNum() { return dishNames.length; }
}

public class Example13_14 {
	public static void main(String[] args) throws Exception {
		Table table = new Table();  // 여러 쓰레드가 공유하는 객체
		
		// 요리사 스레드 시작
		new Thread(new Cook(table), "COOK").start();
		
		// 두 명의 손님 스레드 시작
		new Thread(new Customer(table, "donut"), "CUST1").start();
		new Thread(new Customer(table, "burger"), "CUST2").start();
		
		Thread.sleep(5000);  // 5초 대기
		System.exit(0);  // 프로그램 종료
	}
}