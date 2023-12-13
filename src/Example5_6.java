public class Example5_6 {
	public static void main(String[] args) {
		String[] names = {"Kim", "Park", "Yi"};  // 문자열을 저장하는 배열 초기화
		
		for(int i = 0; i < names.length; i++)
			System.out.println("names["+i+"]:" + names[i]);  // 배열의 각 요소 출력

		String tmp = names[2];  // 배열 names의 세 번째 요소를 tmp에 저장
		System.out.println("tmp : " + tmp);  // tmp 변수 출력
		names[0] = "Yu";  // 배열 names의 첫 번째 요소를 "Yu"로 변경
		
		for(int i = 0; i < names.length; i++)
			System.out.println(names[i]);  // 변경된 배열 names의 각 요소 출력
	}  // main
}