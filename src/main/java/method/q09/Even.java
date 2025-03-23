package method.q09;

public class Even {
	public static void main(String[] args) {
		int num = 7;
		boolean result = checkEven(num);
		System.out.println(num + "は" + (result ? "偶数" : "奇数") + "です。");
	}

	public static boolean checkEven(int a) {
		return a % 2 == 0;
	}
}