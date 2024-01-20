class Example8_10 {
	public static void main(String[] args) {
		try {
			install();  // 설치 메서드 호출
		} catch(InstallException e) {
			e.printStackTrace();  // InstallException 발생 시 스택 트레이스 출력
		} catch(Exception e) {
			e.printStackTrace();  // 그 외 예외 발생 시 스택 트레이스 출력
		}
	}
	
	static void install() throws InstallException {
		try {
			startInstall();  // 프로그램 설치 시작
			copyFiles();  // 파일 복사
		} catch (SpaceException2 e) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e);  // SpaceException2를 원인 예외로 설정
			throw ie;  // InstallException 발생
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);  // MemoryException2를 원인 예외로 설정
			throw ie;  // InstallException 발생
		} finally {
			deleteTempFiles();  // 프로그램 설치에 사용된 임시 파일 삭제
		}
	}
	
	static void startInstall() throws SpaceException2, MemoryException2 {
		if(!enoughSpace()) {
			throw new SpaceException2("설치할 공간이 부족합니다.");  // 공간 부족 예외 발생
		}
		
		if(!enoughMemory()) {
			throw new MemoryException2("메모리가 부족합니다.");  // 메모리 부족 예외 발생
		}
	}
	
	static void copyFiles() { /* 파일들을 복사하는 코드를 적는다. */ }
	static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다. */ }
	
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;  // 충분한 공간이 없음
	}
	
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;  // 충분한 메모리 있음
	}
}

class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg);
	}
}

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
		super(msg);
	}
}
