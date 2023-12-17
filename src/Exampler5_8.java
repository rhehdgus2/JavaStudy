public class Exampler5_8 {
	public static void main(String[] args) {
		int[][] score = {
				{ 100, 100, 100}
			  , { 20, 20, 20}
			  , { 30, 30, 30}
			  , { 40, 40, 40}
			  , { 50, 50, 50}
		   };
		// 과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		
		System.out.println("번호  국어   영어  수학  총점   평균 ");
		System.out.println("=============================");
		
		// 학생별 성적을 출력하고 과목별 총점 및 평균을 계산하는 반복문
		for(int i = 0; i < score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i + 1);
			
			// 각 과목별 성적을 출력하고 총점 계산
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum / (float)score[i].length;	// 평균 계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		
		System.out.println("=============================");
		// 과목별 총점 출력
		System.out.printf("총점:  %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}
}