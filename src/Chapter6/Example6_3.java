package Chapter6;

public class Example6_3 {
	public static void main(String[] args) {
		// 클래스 변수(static변수)는 객체생성 없이 '클래스이름.클래스 변수'로 직접 사용 가능
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		// 인스턴스 변수의 값을 변경한다.
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		// 클래스 변수의 값을 변경한다. (클래스 변수는 모든 인스턴스에 영향을 미침)
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number
				+ "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
		System.out.println("c2은 " + c2.kind + ", " + c2.number
				+ "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );
	}
}

class Card {
	String kind;   // 인스턴스 변수: 객체마다 다른 값을 가짐
	int number;    // 인스턴스 변수: 객체마다 다른 값을 가짐
	static int width = 100;    // 클래스 변수: 모든 객체가 공유하는 값
	static int height = 250;   // 클래스 변수: 모든 객체가 공유하는 값
}