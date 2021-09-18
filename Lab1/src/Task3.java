import java.util.Arrays;

public final class Task3 {
	public final static void main(String[] args) {
		System.out.println("Task 3: 'Merging int array and char array to String'");
		final int[] a = {1,1,2,3,5,8,13};
		final char[] c = {'h','e','l','l','o'};
		System.out.println(Arrays.toString(a));
		System.out.println(c);
		final String s = merge(a, c);
		System.out.println(s);
	}
	public final static String merge(int[] a, char[] c) {
		String result = "";
		for (int i = 0; i < Math.max(a.length, c.length); i++) {
			if (i < a.length) result += a[i];
			if (i < c.length) result += c[i];
		}
		return result;
	}
}

