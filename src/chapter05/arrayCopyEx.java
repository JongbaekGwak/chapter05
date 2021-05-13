package chapter05;

import java.util.Arrays;

public class arrayCopyEx {

	public static void main(String[] args) {
		String oldStrArr[] = { "Java", "array", "copy" };
		String newStrArr[] = new String[5];

		System.out.println("----- 원본 배열 oldStrArr -----");

		for (int i = 0; i < oldStrArr.length; i++) {
			System.out.print(oldStrArr[i] + ", ");
		}

		System.out.println("\n----- 사본 배열 newStrArr -----");

		for (int i = 0; i < newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}

//		arraycopy(원본배열명, 원본배열시작index, 사본배열명, 사본배열시작index, 복사할크기)
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

		System.out.println("\n----- 원본 배열 oldStrArr -----");

		for (int i = 0; i < oldStrArr.length; i++) {
			System.out.print(oldStrArr[i] + ", ");
		}

		System.out.println("\n----- 사본 배열 newStrArr -----");

		for (int i = 0; i < newStrArr.length; i++) {
			System.out.print(newStrArr[i] + ", ");
		}

		System.out.println("\n----- Array 클래스 이용하여 복사 -----");
//		Arrays 클래스틑 배열을 위한 여러가지 메서드를 지원하고 있음

//		Arrays.copyDf() : Arrays 클래스의 배열 복사 메서드
//		전달 받은 배열의 특정 길이만큼 새로운 배열로 복사하여 반환
//		만약 원본 배열의 크기보다 사본 배열의 크기가 클 경우 원본 배열의 크기를 넘어서는 영역을 해당 데이터 타입의 초기값으로 초기화하여 배열을 생성함
//		ex) 사본배열명 = Arrays.copyOf(원본배열명, 사본의 크기);

		System.out.println("\n----- Arrays.copyOf -----");
		String oriStrArr[] = { "html", "css", "javascript", "jquery", "java" };
		String copyStrArr1[] = Arrays.copyOf(oriStrArr, 5);

		for (int i = 0; i < copyStrArr1.length; i++) {
			System.out.println("copyStrArr1 [" + i + "] : " + copyStrArr1[i]);
		}

		String copyStrArr2[] = Arrays.copyOf(oriStrArr, 3);
		String copyStrArr3[] = Arrays.copyOf(oriStrArr, 10);

		System.out.println("\n----- -----");
		for (int i = 0; i < copyStrArr2.length; i++) {
			System.out.println("copyStrArr2 [" + i + "] : " + copyStrArr2[i]);
		}

		System.out.println("\n----- -----");
		for (int i = 0; i < copyStrArr3.length; i++) {
			System.out.println("copyStrArr3 [" + i + "] : " + copyStrArr3[i]);
		}

//		Arrays.copyDfRange() : 전달받은 배열의 특정 범위에 해당하는 요소만을 새로운 배열로 복사하여 반환
//		ex) 사본배열명 = Arrays.copyOfRange(원본배열명, 시작index, 끝index -1);

		System.out.println("\n----- Arrays.copyOfRange -----");
		String oriStrArrRange[] = { "html", "css", "javascript", "jquery", "java" };
		String copyStrArrRange[] = Arrays.copyOfRange(oriStrArrRange, 1, 4);

		for (int i = 0; i < copyStrArrRange.length; i++) {
			System.out.println("copyStrArrRange [" + i + "] : " + copyStrArrRange[i]);
		}

//		Arrays.fill() : 전달받은 배열의 모든 요소를 특정 값으로 초기화해 줌
//		ex) Arrays.fill(배열명, 채울 데이터);

		System.out.println("\n----- Arrays.fill -----");
		String oriStrArrFill[] = new String[5]; // 참조형 String 타입의 빈 배열 선언, String은 참조형이므로 null로 데이터가 초기화 됨
		Arrays.fill(oriStrArrFill, "java");

		for (int i = 0; i < oriStrArrFill.length; i++) {
			System.out.println("oriStrArrFill [" + i + "] : " + oriStrArrFill[i]);
		}
	}

}
