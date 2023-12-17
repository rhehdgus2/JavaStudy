import java.util.Scanner;

public class Example5_9 {
	public static void main(String[] args) {
		// 영어 단어와 그에 대한 한글 뜻을 저장한 2차원 배열
		String[][] words = {
		   {"chair", "의자"},
		   {"computer", "컴퓨터"},
		   {"integer", "정수"}
		};
		
		Scanner sc = new Scanner(System.in);
		
		// 각 문제에 대한 사용자 입력을 받아 정답을 체크하는 반복문
		for(int i = 0; i < words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);
			
			String tmp = sc.nextLine();	// 사용자 입력 받기
			
			// 사용자 입력과 정답 비교
			if(tmp.equals(words[i][1])) {
				System.out.printf("정답입니다.%n%n");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);
			}
		} // for
	} // main의 끝
}