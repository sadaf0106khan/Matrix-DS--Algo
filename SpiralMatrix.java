package matrix;

public class SpiralMatrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, 5 }, { 5, 6, 7, 8, 8 }, { 9, 10, 11, 12, 12 }, { 13, 14, 15, 16, 14 } };
		spiralForm(a, 4, 5);
	}

	public static void spiralForm(int[][] a, int m, int n) {
		int startrow = 0;
		int lastrow = m - 1;
		int startcol = 0;
		int lastcol = n - 1;
		int dir = 0;
		while (startrow <= lastrow && startcol <= lastcol) {
			if (dir == 0) {
				for (int i = startcol; i <= lastcol; i++)
					System.out.print(a[startrow][i] + " ");
				startrow++;
			} else if (dir == 1) {
				for (int i = startrow; i <= lastrow; i++)
					System.out.print(a[i][lastcol] + " ");
				lastcol--;
			} else if (dir == 2) {
				for (int i = lastcol; i >= startcol; i--)
					System.out.print(a[lastrow][i] + " ");
				lastrow--;
			} else if (dir == 3) {
				for (int i = lastrow; i >= startrow; i--)
					System.out.print(a[i][startcol] + " ");
				startcol++;
			}

			dir = (dir + 1) % 4;
		}

	}
}
