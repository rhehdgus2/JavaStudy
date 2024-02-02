package Chapter11;

import java.util.Arrays;

public class Example11_6 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] arr2D = {{11, 12, 13}, {21, 22, 23}};

        // 1. 배열 출력
        System.out.println("arr = " + Arrays.toString(arr));
        System.out.println("arr2D = " + Arrays.deepToString(arr2D));

        // 2. 배열 복사
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = Arrays.copyOf(arr, 3);
        int[] arr4 = Arrays.copyOf(arr, 7);
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4);
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7);

        // 3. 복사된 배열 출력
        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("arr4 = " + Arrays.toString(arr4));
        System.out.println("arr5 = " + Arrays.toString(arr5));
        System.out.println("arr6 = " + Arrays.toString(arr6));

        // 4. 배열 초기화 및 출력
        int[] arr7 = new int[5];
        Arrays.fill(arr7, 9);  // arr7 = [9, 9, 9, 9, 9]
        System.out.println("arr7 = " + Arrays.toString(arr7));

        // 5. 랜덤 값으로 배열 초기화 및 출력
        Arrays.setAll(arr7, i -> (int)(Math.random() * 6) + 1);
        System.out.println("arr7 = " + Arrays.toString(arr7));

        // 6. 배열 값에 따른 그래프 출력
        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph) + i);
        }

        // 7. 배열 비교
        String[][] str2D = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D2 = new String[][] {{"aaa", "bbb"}, {"AAA", "BBB"}};
        System.out.println(Arrays.equals(str2D, str2D2));      // false
        System.out.println(Arrays.deepEquals(str2D, str2D2));  // true

        // 8. 배열 정렬 및 검색
        char[] chArr = { 'A', 'D', 'C', 'B', 'E' };
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("B의 인덱스 = " + Arrays.binarySearch(chArr, 'B'));
        Arrays.sort(chArr);
        System.out.println("= 정렬 후 =");
        System.out.println("chArr = " + Arrays.toString(chArr));
        System.out.println("B의 인덱스 = " + Arrays.binarySearch(chArr, 'B'));
    }
}