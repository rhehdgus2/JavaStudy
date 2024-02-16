package Chapter15;

import java.io.File;
import java.io.IOException;

public class Example15_15 {
	public static void main(String[] args) throws IOException {
		// File 객체 생성, 파일 경로 지정
		File f = new File(".\\src\\Chapter15\\Example15_15.java");
		// 파일 이름 추출
		String fileName = f.getName();
		// 파일 이름에서 마지막 점('.')의 위치 찾기
		int pos = fileName.lastIndexOf(".");
		
		// 파일 이름 출력
		System.out.println("경로를 제외한 파일 이름 - " + f.getName());
		// 확장자를 제외한 파일 이름 출력
		System.out.println("확장자를 제외한 파일 이름 - " + fileName.substring(0, pos));
		// 확장자 출력
		System.out.println("확장자 - " + fileName.substring(pos+1));
		
		// 경로를 포함한 파일 이름 출력
		System.out.println("경로를 포함한 파일 이름 - " + f.getPath());
		// 파일의 절대 경로 출력
		System.out.println("파일의 절대 경로 - " + f.getAbsolutePath());
		// 파일의 정규 경로 출력
		System.out.println("파일의 정규 경로 - " + f.getCanonicalPath());
		// 파일이 속해 있는 디렉토리 출력
		System.out.println("파일이 속해 있는 디렉토리 - " + f.getParent());
		System.out.println();
		
		// 파일 경로 구분자 및 시스템 속성 출력
		System.out.println("File.pathSeparator - " + File.pathSeparator);
		System.out.println("File.pathSeparatorChar - " + File.pathSeparatorChar);
		System.out.println("File.separator - " + File.separator);
		System.out.println("File.separatorChar - " + File.separatorChar);
		System.out.println();
		
		// 시스템 속성 출력
		System.out.println("user.dir = " + System.getProperty("user.dir"));
		System.out.println("sun.boot.class.path = " + System.getProperty("sun.boot.class.path"));
	}
}