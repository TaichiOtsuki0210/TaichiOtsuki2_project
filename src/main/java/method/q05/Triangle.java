package method.q05;

public class Triangle {
	public static void main(String[] args) {
		int i = 8;
		int j = 5;
		double triangleArea = getTriangleArea(i, j);

		System.out.println("底辺：" + i);
		System.out.println("高さ:" + j);
		System.out.println("三角形の面積：" + triangleArea);
	}

	public static double getTriangleArea(double bottom, double height) {
		int area = (int) (bottom * height) / 2;
		return area;
	}

}
