package matrix;

public class MatrixMultiplication {
	public static void main(String[] args) {
//		int[][] a = { { 1, 1, 1 }, { 1, 1, 1 } };
//		int[][] b = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
		int[][] a = { { 1, 1 }, { 1, 1 } };
		int[][] b = { { 1, 1 }, { 1, 1 } };
		multiplication(a, b, 2, 2, 2);
	}

	public static void multiplication(int[][] a, int[][] b, int m, int n, int p) {

		int[][] c = new int[m][p];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				c[i][j] = 0;
				for (int k = 0; k < n; k++)
					c[i][j] += a[i][k] * b[k][j];
			}
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < p; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
