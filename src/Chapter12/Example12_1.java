package Chapter12;

import java.util.ArrayList;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Example12_1 {
	public static void main(String[] args) {
		// Product 타입을 저장하는 ArrayList 생성
		ArrayList<Product> productList = new ArrayList<Product>();
		
		// Tv 타입을 저장하는 ArrayList 생성
		ArrayList<Tv> tvList = new ArrayList<Tv>();
//		ArrayList<Product> tvList = new ArrayList<Tv>();  // 에러.
//		List<Tv> tvList = new ArrayList<Tv>(); // OK. 다형성
		
		// 다형성을 이용하여 Tv 객체를 Product 리스트에 추가
		productList.add(new Tv());
		
		// 다형성을 이용하여 Audio 객체를 Product 리스트에 추가
		productList.add(new Audio());
		
		// Tv 객체를 Tv 리스트에 추가
		tvList.add(new Tv());
		tvList.add(new Tv());
		
		// Product 리스트를 출력하는 메서드 호출
		printAll(productList);
		// printAll(tvList);  // 컴파일 에러가 발생한다.
	}
	
	// Product 타입의 ArrayList를 출력하는 메서드
	public static void printAll(ArrayList<Product> list) {
		for (Product p : list)
			System.out.println(p);
	}
}


