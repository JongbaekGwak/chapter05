package chapter05;

public class arrayInArrayEx {

	public static void main(String[] args) {
//		2차원 배열 선언 방식
		int mathScores[][] = new int[2][3];
		for (int i = 0; i < mathScores.length; i++) {
			for (int k = 0; k < mathScores[i].length; k++) {
				System.out.println("mathScores [" + i + "] [" + k + "] = " + mathScores[i][k]);
			}
		}
		System.out.println();

//		2차원 배열 선언 방식
//		외부 배열의 크기는 2로 고정, 내부 배열의 크기는 모름
		int engScores[][] = new int[2][];

//		외부 배열의 0번 인덱스에 요소로 새 1차원 배열 선언 (배열의 크기는 2로 선언)
		engScores[0] = new int[2];
//		외부 배열의 1번 인덱스에 요소로 새 1차원 배열을 선언 (배열의 크기는 3로 선언)
		engScores[1] = new int[3];
//		2차원 배열의 각 크기가 다른 이유는 결국 외부 배열의 요소는 1차원 배열이고, 배열은 참조 타입의 변수
//		참조 타입은 결국 힙 메모리 영역의 주소를 저장하고 있으므로 2차원 배열의 요소로 힙 메모리 영역의 주소가 저장되는 형태
		
//		외부 배열의 크기는 2
		for (var i = 0; i < engScores.length; i++) {
			for (int k = 0; k < engScores[i].length; k++) {
				System.out.println("engScores [" + i + "] [" + k + "] = " + engScores[i][k]);
			}
		}
		System.out.println();

		int javaScores[][] = { { 95, 80 }, { 92, 96, 80 } };
		for (var i = 0; i < javaScores.length; i++) {
			for (int k = 0; k < javaScores[i].length; k++) {
				System.out.println("javaScores [" + i + "] [" + k + "] = " + javaScores[i][k]);
			}
		}

	}

}
