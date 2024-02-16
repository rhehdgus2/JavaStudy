package Chapter15;

import java.io.File;

public class Example15_17 {
	static int deletedFiles = 0;
	
	public static void main(String[] args) {
		// 명령행 인자의 길이가 1이 아니면 사용법 출력 후 종료
		if(args.length != 1) {
			System.out.println("USAGE : java Example15_17 Extension");
			System.exit(0);
		}
		
		// 현재 작업 디렉토리를 얻어옴
		String currDir = System.getProperty("user.dir");
		
		// 현재 작업 디렉토리를 기반으로 File 객체 생성
		File dir = new File(currDir);
		
		// 삭제할 파일의 확장자
		String ext = "." + args[0];
		
		// delete 메서드 호출하여 파일 삭제 수행
		delete(dir, ext);
		
		// 삭제된 파일의 개수 출력
		System.out.println(deletedFiles + "개의 파일이 삭제되었습니다.");
	}  // end of main
	
	// 디렉토리를 순회하며 특정 확장자를 가진 파일을 삭제하는 메서드
	public static void delete(File dir, String ext) {
		// 디렉토리 내의 파일 목록을 가져옴
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++)
			if(files[i].isDirectory()) {
				// 만약 하위 디렉토리면 재귀 호출
				delete(files[i], ext);
			} else {
				String filename = files[i].getAbsolutePath();
				
				if(filename.endsWith(ext)) {
					// 확장자가 일치하는 파일을 찾았을 때의 처리
					System.out.print(filename);
					if(files[i].delete()) {
						System.out.println(" - 삭제 성공");
						deletedFiles++;
					} else
						System.out.println(" - 삭제 실패");
				}
			}  // if(files[i].isDirectory()) {
	}  // end of delete
}