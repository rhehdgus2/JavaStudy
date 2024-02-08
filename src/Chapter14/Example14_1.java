package Chapter14;

//함수형 인터페이스 정의
interface MyFunction {
	void run();  // public abstract void run();
}

public class Example14_1 {
	static void execute(MyFunction f) {  // 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드
		MyFunction f = () -> System.out.println("f3.run()");
		return f;
	}
	
	public static void main(String[] args) {
		// 람다식으로 MyFunction의 run()을 구현
		MyFunction f1 = () -> System.out.println("f1.run()");
		
		// 익명 클래스로 MyFunction 인터페이스의 run()을 구현
		MyFunction f2 = new MyFunction() {
			public void run() {  // public을 반드시 붙여야 함
				System.out.println("f2.run()");
			}
		};
		
		// getMyFunction 메서드로 생성된 MyFunction 객체
		MyFunction f3 = getMyFunction();
		
		// 각각의 MyFunction 객체의 run() 메서드 호출
		f1.run();
		f2.run();
		f3.run();
		
		// execute 메서드로 MyFunction 객체 전달
		execute(f1);
		// 람다식을 직접 execute 메서드로 전달
		execute( () -> System.out.println("run()") );
	}
}
