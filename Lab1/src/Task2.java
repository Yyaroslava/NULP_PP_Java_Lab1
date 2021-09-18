import java.util.Arrays;

public final class Task2 {
	public final static void main(String[] args) {
		System.out.println("Task 2: 'Count number of character in String array'");
		String s = "Hello, my name is Yaroslava Moroz";
		System.out.println(s);
		System.out.println("Count of 'o' characters: " + count(s, 'o') );
	}

	public final static int count(String s, char c) {
		int result = 0;
		for (char cc : s.toCharArray()) {
			if (cc == c) result++;
		}
		return result;
	}
}
