package method.q06;

public class Circle {
	public static void main(String[] args) {
		double i = 5.0;
		double CircleArea = getCircleArea(i);
		System.out.println("半径：" + i);
		System.out.println("円の面積：" + CircleArea);
	}

	public static double getCircleArea(double r) {
		double area = r * r * 3.14;
		return area;
	}

}