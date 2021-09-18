import java.util.Arrays;

public final class Task6 {
	public final static void main(String[] args) {
		System.out.println("Task 6: 'Matrix multiplying'");
		final int[][] A = {
				{2,6,8,10},
				{1,3,5,-7}
		};
		final int[][] B = {
				{2,6,8},
				{1,3,5},
				{0,0,0,},
				{4,-2,1}
		};
		System.out.println("Matrix A: ");
		print(A);
		System.out.println("Matrix B: ");
		print(B);
		final int[][] C = mul(A,B);
		System.out.println("Matrix AxB: ");
		print(C);
	}

	public final static int[][] mul(int[][] A, int[][] B) {
		int[][] result = new int[A.length][B[0].length];
		for (int i = 0; i < A.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				result[i][j] = 0;
				for(int k = 0; k < B.length; k++) {
					result[i][j] += A[i][k]*B[k][j];
				}
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



