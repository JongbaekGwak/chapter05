package chapter05;

public class arrayCreateByValueListEx {

	public static void main(String[] args) {
		int score[] = { 83, 90, 87 };

		System.out.println("score[0] : " + score[0]);
		System.out.println("score[1] : " + score[1]);
		System.out.println("score[2] : " + score[2]);

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += score[i];
		}

		System.out.println("총합 : " + sum);

		double avg = (double) sum / 3;

		System.out.println("평균 : " + avg);
		
		System.out.print("-----------");

		int score2[];
		score2 = new int[] { 80, 87, 77 };

		System.out.println("score2[0] : " + score2[0]);
		System.out.println("score2[1] : " + score2[1]);
		System.out.println("score2[2] : " + score2[2]);

		int sum2 = 0;

		for (var i = 0; i < 3; i++) {
			sum2 += score2[i];
		}

		System.out.println("총합 : " + sum2);

		double avg2 = (double) sum2 / 3;

		System.out.println("평균 : " + avg2);
		
		System.out.print("-----------");
		
		int score3[];
//		score3 = {};	//	빈배열을 먼저 선언만 하고 나중에 배열에 데이터를 입력할 경우 반드시 new 키워드를 사용해야함
//		혹은 기존에 먼저 생성된 배열을 대입해야 함
		score3 = score2; // 기존에 배열 score2를 배열 score3에 대입
		score3 = new int[] {80,90,70};	//	새로운 배열을 new 키워드로 생성
		
		System.out.println("score3[0] : " + score3[0]);
		System.out.println("score3[1] : " + score3[1]);
		System.out.println("score3[2] : " + score3[2]);

		int sum3 = 0;

		for (var i = 0; i < 3; i++) {
			sum3 += score3[i];
		}

		System.out.println("총합 : " + sum3);

		double avg3 = (double) sum3 / 3;

		System.out.println("평균 : " + avg3);
		
	}

}
