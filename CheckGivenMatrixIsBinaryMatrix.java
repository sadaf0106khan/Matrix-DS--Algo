package matrix;

public class CheckGivenMatrixIsBinaryMatrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 1 }, { 1, 0 } };
		System.out.println(isBinary(a, 2, 2));
	}

	public static boolean isBinary(int[][] a, int m, int n) {

		//for (int i = 0; i < m; i++) {
			for(int []ar:a) {
				for(int ele:ar) {
			//for (int j = 0; j < n; j++) {
				if (ele< 0 ||ele > 1) {
					return false;
				}
			}

		}
		return true;
	}
}
