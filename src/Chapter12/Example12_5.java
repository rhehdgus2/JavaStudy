package Chapter12;
//열거형 Direction 정의
enum Direction { EAST, SOUTH, WEST, NORTH }

public class Example12_5 {
	public static void main(String[] args) {
		// 열거형 상수를 직접 할당
		Direction d1 = Direction.EAST;
		
		// valueOf 메서드를 이용하여 문자열에서 열거형 상수 얻기
		Direction d2 = Direction.valueOf("WEST");
		
		// Enum 클래스의 valueOf 메서드를 이용하여 열거형 상수 얻기
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		// 각 열거형 상수 출력
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
		System.out.println("d3 = " + d3);
		// 열거형 상수 비교
		System.out.println("d1 == d2 ? " + (d1 == d2));
		System.out.println("d1 == d3 ? " + (d1 == d3));
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
//		System.out.println("d2 > d3 ? " + (d1 > d3));  // 에러
		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
		
		// switch 문을 이용한 열거형 상수 처리
		switch(d1) {
			case EAST:  // Direction.EAST라고 쓸 수 없다.
				System.out.println("The direction is EAST."); break;
			case SOUTH:
				System.out.println("The direction is SOUTH."); break;
			case WEST:
				System.out.println("The direction is WEST."); break;
			case NORTH:
				System.out.println("The direction is NORTH."); break;
			default:
				System.out.println("Invalid direction"); break;
		}
		
		// 열거형 상수 배열 얻기 및 출력
		Direction[] dArr = Direction.values();
		
		// 열거형 Direction의 모든 상수를 배열로 얻어와서 순회하며 출력
		for(Direction d : dArr)  // for(Direction d : Direction.values())
			
			// name() 메서드로 상수의 이름을, ordinal() 메서드로 상수의 순서(인덱스)를 얻어와 출력
			System.out.printf("%s = %d%n", d.name(), d.ordinal());
	}
}