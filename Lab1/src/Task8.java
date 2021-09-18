import java.util.Arrays;

public class Task8 {
	public static class CustomDouble {
		public int Int;
		public double Frac;

		CustomDouble(final int _Int, final double _Frac) throws Exception{
			if(_Int < 0 && _Frac > 0) {
				throw new Exception("Int and Frac must have the same sign!");
			};
			if(_Int > 0 && _Frac < 0) {
				throw new Exception("Int and Frac must have the same sign!");
			};
			this.Int = _Int;
			this.Frac = _Frac;
		}

		CustomDouble(final double d) {
			this.Int = (int)d;
			this.Frac = d - this.Int;
		}

		@Override
		public boolean equals(final Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (!(obj instanceof CustomDouble)) return false;
			final CustomDouble other = (CustomDouble) obj;
			if (hashCode() != other.hashCode()) return false;
			if (Int != other.Int) return false;
			if (Frac != other.Frac) return false;
			return true;
		}

		@Override
		public int hashCode() {
			Double FracObj = Frac;
			int result = 17;
			result = 31 * result + Int;
			result = 31 * result + FracObj.hashCode();
			return result;
		}

		public double toDouble() {
			return Frac + Int;
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
			if (cd.Int == 0 && cd.Frac == 0) {
				throw new Exception("Division by zero!");
			}
			final double d = toDouble() / cd.toDouble();
			return new CustomDouble(d);
		}

		@Override
		public String toString() {
			return String.format("{ Int: %d, Frac: %f }", this.Int, this.Frac);
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




