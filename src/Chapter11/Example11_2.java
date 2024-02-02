package Chapter11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Example11_2 {
	public static void main(String[] args) {
		// Stack 객체 생성
		Stack st = new Stack();
		// Queue 인터페이스의 구현체인 LinkedList를 사용하여 Queue 객체 생성
		Queue q = new LinkedList();
		
		// 스택에 요소 추가
		st.push("0");
		st.push("1");
		st.push("2");
		
		// 큐에 요소 추가
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		System.out.println("= Stack =");
		// 스택이 비어있지 않은 동안 반복
		while(!st.empty()) {
			// 스택에서 요소 하나를 꺼내서 출력
			System.out.println(st.pop());
		}
		
		System.out.println("= Queue =");
		// 큐가 비어있지 않은 동안 반복
		while(!q.isEmpty()) {
			// 큐에서 요소 하나를 꺼내서 출력
			System.out.println(q.poll());
		}
	}
}