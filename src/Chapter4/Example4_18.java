package Chapter4;

public class Example4_18 {
	public static void main(String[] args) {
		// for문에 Loop1이라는 이름을 붙임
		Loop1 : for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				// j가 5일 때 Loop1 레이블이 붙은 for문을 빠져나감
				if(j == 5)
					break Loop1;
//					break;  → 내부 for문만 종료됨
//					continue Loop1;
//					continue;
				System.out.println(i + "*" + j + "=" + i * j);
			} // end of for i
			System.out.println();
		} // end of Loop1
	}
}