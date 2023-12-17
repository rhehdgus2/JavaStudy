public class Example5_7 {
	public static void main(String[] args) {
		// 2차원 배열 선언 및 초기화
		int[][] score = {
				{ 100, 100, 100 },
				{ 20, 20, 20 },
				{ 30, 30, 30 },
				{ 40, 40, 40 }
		};
		int sum = 0;	// 배열 요소의 합을 저장할 변수 초기화
		
		// 이중 반복문을 사용하여 2차원 배열의 각 요소에 접근
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				// 배열의 각 요소를 출력하고 위치 정보와 함께 표시
				System.out.printf("score[%d][%d] = %d%n", i, j, score[i][j]);
				
				// 배열 요소의 값을 합산
				sum += score[i][j];
			}
		}
		
		// 모든 배열 요소의 합 출력
		System.out.println("sum = " + sum);
	}
}