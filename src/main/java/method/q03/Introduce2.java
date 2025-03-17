package method.q03;

public class Introduce2 {
	public static void main(String[] args) {
		String name = "山田";
		int age = 25;
		selfintroduce(name, age);
	}

	public static void selfintroduce(String name, int age) {
		System.out.println("私の名前は" + name + "です。年齢は" + age + "歳です。");
	}
}