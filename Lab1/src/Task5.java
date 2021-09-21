import java.util.Arrays;

public final class Task5 {
	public final static void main(String[] args) {
		System.out.println("Task 5: 'The transpose of a NxM matrix'");
		final int[][] m = {
				{2,6,8,10},
				{1,3,5,-7},
				{0,0,0,-2}
		};
		System.out.println("Matrix: ");
		print(m);
		final int[][] tm = transpose(m);
		System.out.println("Transposed matrix: ");
		print(tm);
	}

	public final static int[][] transpose(int[][] m) {
		int[][] result = new int[m[0].length][m.length];
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				result[j][i] = m[i][j];
			}
		}
		return result;
	}

	public final static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for(int j = 0; j < m[0].length; j++) {
				System.out.printf("%8d", m[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}


