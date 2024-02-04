package Chapter12;

import java.util.ArrayList;

//과일을 나타내는 클래스와 인터페이스 정의
class Fruit implements Eatable {
	public String toString() { return "Fruit"; }
}
class Apple extends Fruit { public String toString() { return "Apple"; } }
class Grape extends Fruit { public String toString() { return "Grape"; } }
class Toy { public String toString() { return "Toy"; } }

//Eatable 인터페이스 정의
interface Eatable {}

//과일을 담는 상자 클래스 정의
public class Example12_3 {
	public static void main(String[] args) {
		// 과일 상자 및 과일 객체 생성
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Grape> grapeBox = new FruitBox<Apple>();  // 에러. 타입 불일치
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();        // 에러.
		
		// 과일 상자에 과일 추가
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		
		// 사과 상자에 사과 추가
		appleBox.add(new Apple());
//		appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아님
		
		// 포도 상자에 포도 추가
		grapeBox.add(new Grape());
		
		// 결과 출력
		System.out.println("fruitBox-" + fruitBox);
		System.out.println("appleBox-" + appleBox);
		System.out.println("grapeBox-" + grapeBox);
	}  // main
}

//과일 상자 클래스 정의 (과일 및 Eatable을 상속받는 타입만 받도록 제한)
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

//상자 클래스 정의 (제네릭 타입)
class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	// 상자에 아이템 추가
	void add(T item) { list.add(item); }
	
	// 인덱스에 해당하는 아이템 반환
	T get(int i) { return list.get(i); }
	
	// 상자의 크기 반환
	int size() { return list.size(); }
	
	// 상자의 내용을 문자열로 반환
	public String toString() { return list.toString(); }
}