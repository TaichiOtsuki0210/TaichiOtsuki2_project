package method.q10;

import java.util.Arrays;

public class EvenNumber {
	public static void main(String[] args) {
		int[] array = { 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		int count = getEvenNumbers(array);
		System.out.print(Arrays.toString(array));
		System.out.print("には偶数が" + count + "個あります。");
	}

	public static int getEvenNumbers(int[] array) {
		int count = 0;
		for (int i = 0; i < 10; i++) {
			if (array[i] % 2 == 0) {
				count = count++;
			}
		}
		return count;
	}

}