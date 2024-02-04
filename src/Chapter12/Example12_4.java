package Chapter12;

import java.util.ArrayList;

//과일을 나타내는 클래스 정의
class Fruit2 { public String toString() { return "Fruit"; } }

//사과를 나타내는 클래스 정의 (과일의 자손)
class Apple2  extends Fruit2 { public String toString() { return "Apple"; } }

//포도를 나타내는 클래스 정의 (과일의 자손)
class Grape2  extends Fruit2 { public String toString() { return "Grape"; } }

//주스를 나타내는 클래스 정의
class Juice {
	String name;
	
	Juice(String name) { this.name = name + "Juice"; }
	public String toString() { return name; }
}

//주스를 만드는 기계를 나타내는 클래스 정의
class Juicer {
	// 과일 상자에서 주스를 만들어 반환하는 메서드
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		
		// 과일 상자의 모든 과일을 문자열로 연결
		for(Fruit2 f : box.getList())
			tmp += f + " ";
		
		// 연결된 문자열을 이용하여 주스 객체 생성
		return new Juice(tmp);
	}
}

public class Example12_4 {
	public static void main(String[] args) {
		// 과일 상자 및 사과 상자 객체 생성
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
		
		// 과일 상자에 과일 추가
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		
		// 사과 상자에 사과 추가
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		// 주스를 만들어 출력
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}  // main
}

//과일 상자를 나타내는 제네릭 클래스 정의
class FruitBox2<T extends Fruit2> extends Box2<T> {}

//상자를 나타내는 제네릭 클래스 정의
class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	
	// 상자에 아이템 추가
	void add(T item) { list.add(item); }
	
	// 인덱스에 해당하는 아이템 반환
	T get(int i) { return list.get(i); }
	
	// 상자의 리스트 반환
	ArrayList<T> getList() { return list; }
	
	// 상자의 크기 반환
	int size() { return list.size(); }
	
	// 상자의 내용을 문자열로 반환
	public String toString() { return list.toString(); }
}