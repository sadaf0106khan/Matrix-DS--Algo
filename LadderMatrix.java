package matrix;

public class LadderMatrix {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, }, { 9, 10, 11, 12, }, { 13, 14, 15, 16, } };
		ladderMatrix(a);
	}

	public static void ladderMatrix(int[][] a) {
		
		int k=0;
		int i,j;
		while(k<=a.length-1) {
			i=k;
			j=0;
			while(i>=0) {
				System.out.print(a[i][j]+" ");
				i--;
				j++;
			}
			System.out.println();
			k++;
		}
		
		int l=1;
		while(l<=a.length-1) {
			j=l;
			i=a.length-1;
			while(j<=a.length-1) {
				System.out.print(a[i][j]+" ");
				i--;
				j++;
			}System.out.println();
			l++;
		}
	}
}
