package Chapter11;

import java.util.ArrayList;
import java.util.Iterator;

public class Example11_5 {
    public static void main(String[] args) {
        // ArrayList 생성
        ArrayList<String> list = new ArrayList<>();
        // 요소 추가
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        // Iterator를 이용한 순회
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            // 다음 요소를 가져와서 출력
            String obj = it.next();
            System.out.println(obj);
        }
    }  // main
}