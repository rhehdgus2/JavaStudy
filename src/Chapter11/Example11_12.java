package Chapter11;

import java.util.HashSet;
import java.util.Iterator;

public class Example11_12 {
	public static void main(String[] args) {
        // HashSet 객체 생성
		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		// setA에 요소 추가
		setA.add("1");  setA.add("2");  setA.add("3");
		setA.add("4");  setA.add("5");
		System.out.println("A = " + setA);
		
		// setB에 요소 추가
		setB.add("4");  setB.add("5");  setB.add("6");
		setB.add("7");  setB.add("8");
		System.out.println("B = " + setB);
		
		// setB와 setA의 요소를 비교하여 교집합(setKyo)을 구함
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(setA.contains(tmp))
				setKyo.add(tmp);
		}
		
		// setA와 setB의 차집합(setCha)을 구함
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		
		// setA의 모든 요소를 setHab에 추가 (합집합)
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		// setB의 모든 요소를 setHab에 추가 (합집합)
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("A ∩ B = " + setKyo);
		System.out.println("A ∪ B = " + setHab);
		System.out.println("A - B = " + setCha);
	}
}