package method.q04;

public class Sumnumbers {

	public static void main(String[] args) {
		int i = 3;
		int j = 2;
		int addAns = calculateSum(i, j);
		System.out.println("第一引数：" + i);
		System.out.println("第二引数：" + j);
		System.out.println("加算結果：" + addAns);

	}

	public static int calculateSum(int i, int j) {

		int addAns = i + j;
		return addAns;
	}

}