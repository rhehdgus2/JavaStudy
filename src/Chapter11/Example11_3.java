package Chapter11;

import java.util.EmptyStackException;
import java.util.Stack;

public class Example11_3 {
	public static void main(String[] args) {
		// 프로그램 실행 시 매개변수로 전달된 표현식이 없는 경우 사용법 안내
		if (args.length != 1) {
			System.out.println("Usage : java Example11_3 \"EXPRESSION\"");
			System.out.println("Example : java Example11_3 \"((2 + 3) * 1) + 3\"");
			System.exit(0);
		}
		// 스택 생성
		Stack st = new Stack();
		// 전달받은 수식을 expression 변수에 저장
		String expression = args[0];
		System.out.println("expression : " + expression);
		
		try {
			// 수식의 각 문자를 확인하면서 괄호 처리
			for (int i = 0; i < expression.length(); i++) {
				char ch = expression.charAt(i);
				if (ch == '(') {
					st.push(ch + "");  // 여는 괄호인 경우 스택에 추가
				} else if (ch == ')') {
					st.pop();  // 닫는 괄호인 경우 스택에서 꺼냄
				}
			}
			// 모든 문자 확인 후 스택이 비어있으면 괄호가 일치함을 출력
			if (st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				// 스택이 비어있지 않으면 괄호가 일치하지 않음을 출력
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			// 괄호가 일치하지 않는 경우 EmptyStackException 발생
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}
}