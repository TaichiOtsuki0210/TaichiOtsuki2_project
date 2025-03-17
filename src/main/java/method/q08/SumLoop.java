package method.q08;

public class SumLoop {
	public static void main(String[] args) {
		int i = 1;
		int j = 100;
		int sum = sumLoop(i, j);
		System.out.println("最小値：" + i);
		System.out.println("最大値：" + j);
		System.out.println("加算結果：" + sum);
	}

	public static int sumLoop(int i, int j) {
		int sum = 0;
		for (int a = i; a <= j; a++) {
			sum = sum + a;
		}
		return sum;
	}

}