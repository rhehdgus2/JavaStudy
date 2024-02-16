package Chapter15;

import java.io.File;

public class Example15_18 {
	public static void main(String[] args) {
		// 명령행 인자의 길이가 1이 아니면 사용법 출력 후 종료
		if (args.length != 1) {
			System.out.println("Usage : java Example15_18 DIRECTORY");
			System.exit(0);
		}
		
		// 사용자로부터 전달받은 디렉토리 경로를 기반으로 File 객체 생성
		File dir = new File(args[0]);
		
		// 디렉토리가 존재하지 않거나 디렉토리가 아니면 메시지 출력 후 종료
		if(!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			System.exit(0);
		}
		
		// 디렉토리 내의 파일 목록을 가져옴
		File[] list = dir.listFiles();
		
		// 파일 목록을 순회하며 이름 변경
		for(int i = 0; i < list.length; i++) {
			String fileName = list[i].getName();
			
			// "0000"을 앞에 붙이고 7자리로 자른 새로운 파일명 생성
			String newFileName = "0000" + fileName;
			newFileName = newFileName.substring(newFileName.length() - 7);
			// 파일의 현재 위치에서 새로운 파일명으로 변경
			list[i].renameTo(new File(dir, newFileName));
		}
	}
}