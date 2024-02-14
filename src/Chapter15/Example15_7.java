package Chapter15;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Arrays;
import java.util.Vector;

public class Example15_7 {
	public static void main(String[] args) {
		// 세 개의 바이트 배열 생성
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8};
		byte[] outSrc = null;
		
		// Vector를 사용하여 세 개의 ByteArrayInputStream을 저장
		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		// SequenceInputStream을 사용하여 Vector에 있는 ByteArrayInputStream들을 연결
		SequenceInputStream input = new SequenceInputStream(v.elements());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			// SequenceInputStream을 통해 데이터를 읽고 ByteArrayOutputStream에 쓰는 과정
			while((data = input.read())!= -1) {
				output.write(data);  // void write(int b)
			}
		} catch(IOException e) {}
		
		// ByteArrayOutputStream의 내용을 바이트 배열로 변환하여 outSrc에 저장
		outSrc = output.toByteArray();
		
		// 입력과 출력의 내용을 출력
		System.out.println("Input Source1 : " + Arrays.toString(arr1));
		System.out.println("Input Source2 : " + Arrays.toString(arr2));
		System.out.println("Input Source3 : " + Arrays.toString(arr3));
		System.out.println("Output Source : " + Arrays.toString(outSrc));
	}
}