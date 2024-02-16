package Chapter15;

import java.io.File;

public class Example15_16 {
	public static void main(String[] args) {
		// 명령행 인자의 길이가 1이 아니면 사용법 출력 후 종료
		if(args.length != 1) {
			System.out.println("USAGE : java Example15_16 DIRECTORY");
			System.exit(0);
		}
		
		// 디렉토리 경로를 전달받아 File 객체 생성
		File f = new File(args[0]);
		
		// 파일 또는 디렉토리가 존재하지 않거나 디렉토리가 아니면 메시지 출력 후 종료
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		// 디렉토리 내의 파일 목록을 가져옴
		File[] files = f.listFiles();
		
		// 파일 목록 출력
		for(int i = 0; i < files.length; i++) {
			String fileName = files[i].getName();
			// 디렉토리인 경우 "[파일이름]" 형식으로 출력, 파일인 경우 파일 이름 출력
			System.out.println(files[i].isDirectory() ? "[" + fileName + "]" : fileName);
		}
	}  // main
}