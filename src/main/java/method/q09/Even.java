package method.q09;

public class Even {
	public static void main(String[] args) {
		int i = 7;
		boolean result = checkEven(i);
		System.out.println(i + "は" + (result ? "偶数" : "奇数") + "です。");
	}

	public static boolean checkEven(int a) {
		return a % 2 == 0;
	}
}