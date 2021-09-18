import java.util.Arrays;

public final class Task1 {
	public final static void main(String[] args) {
		System.out.println("Task 1: 'String Array Sorting By Length'");
		String[] s = {"hello", "my", "name", "is", "Yaroslava"};
		System.out.println(Arrays.toString(s));
		sort(s);
		System.out.println(Arrays.toString(s));
	}

	public final static void sort(String[] s) {
		for (int last = s.length-1; last > 0; last--) {
			for (int i = 0; i < last; i++) {
				if (s[i].length() < s[i + 1].length()) continue;
				if (s[i].length() == s[i + 1].length() && s[i].compareTo(s[i + 1]) <= 0) continue;
				String t = s[i];
				s[i] = s[i + 1];
				s[i + 1] = t;
			}
		}
	}

}

