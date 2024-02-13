package Chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Example15_3 {
	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		// 임시로 읽은 데이터를 저장할 배열 (배열 크기가 이전 예제와 다름)
		byte[] temp = new byte[4];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		
		try {
			// 입력 스트림에서 데이터를 읽을 수 있는 동안 반복
			while(input.available() > 0) {
				// 입력 스트림에서 데이터를 임시 배열에 읽어옴
				int len = input.read(temp);
				// 임시 배열의 데이터를 출력 스트림에 씀
				output.write(temp, 0, len);
				// 출력 스트림의 내용을 바이트 배열로 변환하여 outSrc에 저장
				outSrc = output.toByteArray();
				// 현재 배열 상태를 출력하는 메서드 호출
				printArrays(temp, outSrc);
			}
		} catch(IOException e) {}  // IOException이 발생하면 예외를 처리
	}  // main의 끝
	
	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}