package Chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example15_5 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(".\\src\\Chapter15\\Example15_5.java");
			FileOutputStream fos = new FileOutputStream(".\\src\\Chapter15\\Example15_5.bak");
		
			int data = 0;
			while((data = fis.read())!= -1)
				fos.write(data);  // void write(int b)
		
			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}