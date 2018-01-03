package ken.day2.demo;

public class Demo {

	public static void main(String[] args) {

		int a = 14;
		int b = 23;
		// getMax(a,b);
		/*
		 * Demo c=new Demo(); c.getMax(a, b);
		 */
		System.out.println("Max=" + getMax(a, b));
	}

	public static int getMax(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
}
