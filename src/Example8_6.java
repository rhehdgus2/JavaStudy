public class Example8_6 {
	public static void main(String[] args) {
		try {
			Exception e= new Exception("고의로 발생시켰음.");
			throw e;  // 예외를 발생시킴
		//	throw new Exception("고의로 발생시켰음.");  위의 두 줄을 한 줄로 줄인 것
		} catch (Exception e) {
			System.out.println("에러 메시지 : " + e.getMessage());  // 예외 메시지를 출력
			e.printStackTrace();  // 예외 추적 정보를 출력
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
}