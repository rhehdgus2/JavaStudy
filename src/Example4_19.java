import java.util.Scanner;

public class Example4_19 {
	public static void main(String[] args) {
		int menu = 0;	// 사용자가 선택한 메뉴를 저장하는 변수
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");	// 제곱 계산 메뉴 출력
			System.out.println("(2) square root");	// 제곱근 계산 메뉴 출력
			System.out.println("(3) log");		// 로그 계산 메뉴 출력
			System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
			
			String tmp = sc.nextLine();		// 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);	// 입력받은 문자열(tmp)을 숫자로 변환
			
			if(menu == 0) {
				// 0을 선택하면 프로그램 종료 메시지 출력
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1 <= menu && menu <= 3)) {
				// 1 ~ 3 이외의 값 선택 시 경고 메시지 출력 후 반복문 재시작
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;
			}
			// 올바른 메뉴 선택 시 해당 메뉴 번호 출력
			System.out.println("선택하신 메뉴는 " + menu + "번입니다.");
		}
	}	// main의 끝
}