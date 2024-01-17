public class Example7_6 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();  // FireEngine 인스턴스에서 water() 메서드 호출
	    // 부모 클래스 타입의 참조변수에 자식 클래스 인스턴스 대입 (업캐스팅, 형변환 생략 가능)
		car = fe;   // car = (Car)fe;에서 형변환이 생략됨
//      car.water();  : 컴파일 에러, Car타입의 참조변수로는 water()를 호출 불가능
		// 부모 클래스 타입의 참조변수를 다시 자식 클래스 타입으로 형변환 (다운캐스팅)
		fe2 = (FireEngine)car;
		// FireEngine 타입의 참조변수로 water() 메서드 호출
		fe2.water();
	}
}

//부모 클래스 Car 정의
class Car {
	String color;
	int door;
	
	void drive() {    // 운전하는 기능
		System.out.println("drive, Brrrr~");
	}
	
	void stop() {    // 멈추는 기능
		System.out.println("stop!!!");
	}
}

//자식 클래스 FireEngine 정의, Car 클래스를 상속
class FireEngine extends Car {
	void water() {    // 물을 뿌리는 기능
		System.out.println("water!!!");
	}
}