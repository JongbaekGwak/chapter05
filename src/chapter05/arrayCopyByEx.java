package chapter05;

public class arrayCopyByEx {

	public static void main(String[] args) {
		int oldIntArray[] = { 1, 2, 3 };
		int newIntArray[] = new int[5];

		for (int i = 0; i < oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}

		for (int i = 0; i < newIntArray.length; i++) {
			System.out.println(newIntArray[i] + ", ");
		}

		System.out.println();

		int num1[] = new int[] { 1, 2, 3, 4, 5 };
		int num2[] = new int[10];

		for (int i = 0; i < num1.length; i++) {
			System.out.println("num1 {" + i + "} : " + num1[i]);
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println("num2 {" + i + "} : " + num2[i]);
		}

		System.out.println();

		for (int i = 0; i < num1.length; i++) {
			num2[i] = num1[i];
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println("num2 [" + i + "] : " + num2[i]);
		}

		System.out.println();

		int num3[] = new int[] { 1, 2, 3, 4, 5 };
		int num4[] = num3;

		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i]);
		}

		System.out.println();

		num3[0] = 100;
		num4[4] = 5000;

		for (int i = 0; i < num3.length; i++) {
			System.out.println(num3[i]);
		}
		for (int i = 0; i < num4.length; i++) {
			System.out.println(num4[i]);
		}
	}

}
