import java.util.Scanner;

public class Example4_20 {
	public static void main(String[] args) {
		// 사용자가 선택한 메뉴와 계산할 값을 저장하는 변수
		int menu = 0;
		int num = 0;
		Scanner sc = new Scanner(System.in);
		
		outer:	// while문에 outer라는 이름을 붙임
		while(true) {
			System.out.println("(1) square");		// 제곱 계산 메뉴 출력
			System.out.println("(2) square root");	// 제곱근 계산 메뉴 출력
			System.out.println("(3) log");			// 로그 계산 메뉴 출력
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
			
			for(;;) {
				System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = sc.nextLine();
				num = Integer.parseInt(tmp);
				
				if(num == 0)
					break;
				
				if(num == 99)
					break outer;
				
				switch(menu) {
					case 1:
						// 제곱 계산 결과 출력
						System.out.println("result = " + num * num);
						break;
					case 2:
						// 제곱근 계산 결과 출력
						System.out.println("result = " + Math.sqrt(num));
						break;
					case 3:
						// 로그 계산 결과 출력
						System.out.println("result = " + Math.log(num));
						break;
				}
			}	// for(;;)
		}		// while의 끝
	}			// main의 끝
}