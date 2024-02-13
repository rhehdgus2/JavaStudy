package Chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Example15_1 {
	public static void main(String[] args) {
		// 입력용 바이트 배열
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		
		// ByteArrayInputStream과 ByteArrayOutputStream 선언
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		// ByteArrayInputStream과 ByteArrayOutputStream 생성
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		int data = 0;
		
		// 입력 스트림에서 데이터를 읽어 출력 스트림에 쓰기
		while((data = input.read())!= -1)
			output.write(data);  // void write(int b)
		
		outSrc = output.toByteArray();  // 스트림의 내용을 byte 배열로 반환
		
		// 입력과 출력 배열 출력
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}