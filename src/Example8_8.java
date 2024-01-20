public class Example8_8 {
	public static void main(String[] args) {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사
		} catch (SpaceException e) {  // 설치 공간 부족 예외 처리
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {  // 메모리 부족 예외 처리
			System.out.println("에러 메시지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();  // Garbage Collection을 수행하여 메모리를 늘려줌
			System.out.println("다시 설치를 시도하세요.");
		} finally {
			deleteTempFiles();	// 프로그램 설치에 사용된 임시파일들을 삭제
		}  // try의 끝
	}  // main의 끝
	
	// 설치를 시작하기 전에 충분한 공간과 메모리가 있는지 확인
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())	// 충분한 설치 공간이 없으면
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory()) // 충분한 메모리가 없으면
			throw new MemoryException("메모리가 부족합니다.");
	}  // startInstall 메서드의 끝
	
	// 파일들을 복사하는 코드 (구현되지 않음)
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	
	 // 프로그램 설치에 사용된 임시 파일들을 삭제하는 코드 (구현되지 않음)
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/ }
	
	// 설치하는데 필요한 공간이 있는지 확인하는 코드 (구현되지 않음)
	static boolean enoughSpace() {
		// 실제 공간 확인 로직을 구현할 부분
		return false;
	}
	
	// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드 (구현되지 않음)
	static boolean enoughMemory() {
		// 실제 메모리 확인 로직을 구현할 부분
		return true;
	}
} // ExceptionTest 클래스의 끝

//사용자 정의 예외 클래스 SpaceException 정의
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

//사용자 정의 예외 클래스 MemoryException 정의
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}