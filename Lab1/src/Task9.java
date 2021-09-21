import java.util.Arrays;

public class Task9 {
	public static class Calc {
		public static double add(double d1, double d2) throws Exception {
			Task8.CustomDouble cd1 = new Task8.CustomDouble(d1);
			Task8.CustomDouble cd2 = new Task8.CustomDouble(d2);
			return cd1.add(cd2).toDouble();
		}

		public static double sub(double d1, double d2) throws Exception {
			Task8.CustomDouble cd1 = new Task8.CustomDouble(d1);
			Task8.CustomDouble cd2 = new Task8.CustomDouble(d2);
			return cd1.sub(cd2).toDouble();
		}

		public static double mul(double d1, double d2) throws Exception {
			Task8.CustomDouble cd1 = new Task8.CustomDouble(d1);
			Task8.CustomDouble cd2 = new Task8.CustomDouble(d2);
			return cd1.mul(cd2).toDouble();
		}

		public static double div(double d1, double d2) throws Exception {
			Task8.CustomDouble cd1 = new Task8.CustomDouble(d1);
			Task8.CustomDouble cd2 = new Task8.CustomDouble(d2);
			return cd1.div(cd2).toDouble();
		}

		public static int add(int i1, int i2) throws Exception {
			return i1 + i2;
		}

		public static int sub(int i1, int i2) throws Exception {
			return i1 - i2;
		}

		public static int mul(int i1, int i2) throws Exception {
			return i1 * i2;
		}

		public static int div(int i1, int i2) throws Exception {
			if (i2 == 0) {
				throw new Exception("Division by zero!");
			}
			return i1 / i2;
		}

		public static long add(long l1, long l2) throws Exception {
			return l1 + l2;
		}

		public static long sub(long l1, long l2) throws Exception {
			return l1 - l2;
		}

		public static long mul(long l1, long l2) throws Exception {
			return l1 * l2;
		}

		public static long div(long l1, long l2) throws Exception {
			if (l2 == 0L) {
				throw new Exception("Division by zero!");
			}
			return l1 / l2;
		}

	}

	public final static void main(String[] args) throws Exception {
		System.out.println("Task 9: 'Calculator'");
		System.out.println("Operations with double: ");
		System.out.println("0.3 + 1.1 = " + Calc.add(0.3,1.1));
		System.out.println("0.3 - 1.1 = " + Calc.sub(0.3,1.1));
		System.out.println("0.3 * 1.1 = " + Calc.mul(0.3,1.1));
		System.out.println("0.3 / 1.1 = " + Calc.div(0.3,1.1));
		System.out.println("Operations with int: ");
		System.out.println("53 + (-14) = " + Calc.add(53,-14));
		System.out.println("53 - (-14) = " + Calc.sub(53,-14));
		System.out.println("53 * (-14) = " + Calc.mul(53,-14));
		System.out.println("53 / (-14) = " + Calc.div(53,-14));
		System.out.println("Operations with long: ");
		System.out.println("-53365658985L + 14889L = " + Calc.add(-53365658985L, 14889L));
		System.out.println("-53365658985L - 14889L = " + Calc.sub(-53365658985L, 14889L));
		System.out.println("-53365658985L * 14889L = " + Calc.mul(-53365658985L, 14889L));
		System.out.println("-53365658985L / 14889L = " + Calc.div(-53365658985L, 14889L));

	}
}





