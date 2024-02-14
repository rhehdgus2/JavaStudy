package Chapter15;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class Example15_10 {
	public static void main(String[] args) {
		// 입력 데이터 문자열을 선언하고 StringReader로 읽을 수 있도록 함
		String inputData = "ABCD";
		StringReader input = new StringReader(inputData);
		// StringWriter로 출력할 수 있도록 함
		StringWriter output = new StringWriter();
		
		int data = 0;
		
		try {
			// StringReader로부터 데이터를 읽어와 StringWriter에 쓰기
			while((data = input.read())!= -1) {
				output.write(data);  // void write(int b)
			}
		} catch(IOException e) {}
		
		// 입력 데이터와 출력된 데이터를 출력
		System.out.println("Input Data  : " + inputData);
		System.out.println("Output Data : " + output.toString());
		
	}
}