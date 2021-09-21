import java.util.Arrays;

public class Task8 {
	public static class CustomDouble {
		private int intPart;
		private double fracPart;

		public void setIntPart( int intPart) {
			this.intPart = intPart;
		}

		public int getIntPart() {
			return intPart;
		}

		public void setFracPart( int fracPart) {
			this.fracPart = fracPart;
		}

		public double getFracPart() {
			return fracPart;
		}

		CustomDouble(final int intPart, final double fracPart) throws Exception{
			if(intPart < 0 && fracPart > 0) {
				throw new Exception("intPart and fracPart must have the same sign!");
			}
			if(intPart > 0 && fracPart < 0) {
				throw new Exception("intPart and fracPart must have the same sign!");
			}
			this.intPart = intPart;
			this.fracPart = fracPart;
		}

		CustomDouble(final double d) {
			this.intPart = (int)d;
			this.fracPart = d - this.intPart;
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof CustomDouble)) return false;
			final CustomDouble other = (CustomDouble) obj;
			if (hashCode() != other.hashCode()) return false;
			if (intPart != other.intPart) return false;
			if (fracPart != other.fracPart) return false;
			return true;
		}

		@Override
		public int hashCode() {
			Double FracObj = fracPart;
			int result = 17;
			result = 31 * result + intPart;
			result = 31 * result + FracObj.hashCode();
			return result;
		}

		public double toDouble() {
			return fracPart + intPart;
		}

		public CustomDouble add(CustomDouble cd) throws Exception {
			final double d = toDouble() + cd.toDouble();
			return new CustomDouble(d);
		}

		public CustomDouble sub(CustomDouble cd) throws Exception {
			final double d = toDouble() - cd.toDouble();
			return new CustomDouble(d);
		}

		public CustomDouble mul(CustomDouble cd) throws Exception {
			final double d = toDouble() * cd.toDouble();
			return new CustomDouble(d);
		}

		public CustomDouble div(CustomDouble cd) throws Exception {
			if (cd.intPart == 0 && cd.fracPart == 0) {
				throw new Exception("Division by zero!");
			}
			final double d = toDouble() / cd.toDouble();
			return new CustomDouble(d);
		}

		@Override
		public String toString() {
			return String.format("{ intPart: %d, fracPart: %f }", this.intPart, this.fracPart);
		}

		public static int compare(CustomDouble cd1, CustomDouble cd2) {
			return Double.compare(cd1.toDouble(), cd2.toDouble());
		}
	}

	public static CustomDouble cd1;
	public static CustomDouble cd2;
	public static CustomDouble cd3;

	public final static void main(String[] args) throws Exception {
		System.out.println("Task 8: 'CustomDouble class'");
		cd1 = new CustomDouble(14, .78 );
		cd2 = new CustomDouble(-81, -0.9 );
		cd3 = new CustomDouble(110, .555 );
		System.out.println("cd1: " + cd1);
		System.out.println("cd2: " + cd2);
		System.out.println("cd3: " + cd3);

		if (cd1.equals(cd2)) {
			System.out.println("cd1 = cd2");
		} else {
			System.out.println("cd1 != cd2");
		}
		if (cd1.equals(cd3)) {
			System.out.println("cd1 = cd3");
		} else {
			System.out.println("cd1 != cd3");
		}

		System.out.println("cd1 + cd2 = " + cd1.add(cd2));
		System.out.println("cd3 - cd1 = " + cd3.sub(cd1));
		System.out.println("cd1 - cd3 = " + cd1.sub(cd3));

		System.out.println("cd1 and cd2 comparing: " + CustomDouble.compare(cd1, cd2));
		System.out.println("cd2 and cd1 comparing: " + CustomDouble.compare(cd2, cd1));
		System.out.println("cd3 and cd3 comparing: " + CustomDouble.compare(cd3, cd3));
	}
}




