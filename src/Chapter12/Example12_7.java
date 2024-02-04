package Chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")  // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="240101",hhmmss="235959"))
public class Example12_7 {
	public static void main(String[] args) {
		// Example12_7의 Class 객체를 얻는다.
		Class<Example12_7> cls = Example12_7.class;
		
		// TestInfo 애너테이션 정보를 가져와 출력한다.
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()=" + anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" + anno.testDate().hhmmss());
		
		// 배열 형태의 애너테이션 요소를 출력한다.
		for(String str : anno.testTools())
			System.out.println("testTools = " + str);
		
		System.out.println();
		
		// Example12_7에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();
		
		// 가져온 애너테이션을 출력한다.
		for(Annotation a : annoArr)
			System.out.println(a);
	}  // main의 끝
}

//TestInfo 애너테이션 선언
@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface TestInfo {
	int count()		default 1;
	String testedBy();
	String[] testTools()	default "JUnit";
	TestType testType()		default TestType.FIRST;
	DateTime testDate();
}

//DateTime 애너테이션 선언
@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

//TestType 열거형 선언
enum TestType { FIRST, FINAL }