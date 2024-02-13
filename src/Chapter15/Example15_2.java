package Chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class Example15_2 {
	public static void main(String[] args) {
		// 입력용 바이트 배열
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];  // 임시 바이트 배열
		
		// ByteArrayInputStream과 ByteArrayOutputStream 선언
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		
		// ByteArrayInputStream과 ByteArrayOutputStream 생성
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);  // 읽어 온 데이터를 배열 temp에 담는다.
		output.write(temp, 5, 5);          // temp[5]부터 5개의 데이터를 write한다.
		
        // 출력 스트림의 내용을 byte 배열로 반환
		outSrc = output.toByteArray();
		
        // 입력, 임시, 출력 배열 출력
		System.out.println("Input Source  : " + Arrays.toString(inSrc));
		System.out.println("temp          : " + Arrays.toString(temp));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}