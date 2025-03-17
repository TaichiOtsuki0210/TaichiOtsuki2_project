package method.q07;

public class SumNumbers2 {
	public static void main(String[] args) {
		int i = 5;
		double j = 3.3;
		int addAns = calculateSum(i, j);
		System.out.println("第一引数(整数)：" + i);
		System.out.println("第二引数(実数)：" + j);
		System.out.println("加算結果：" + addAns);

	}

	public static int calculateSum(int i, double j) {
		int addAns = (int) (i + j);
		return (int) addAns;
	}

}
