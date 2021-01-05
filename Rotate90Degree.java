package matrix;

public class Rotate90Degree {
public static void main(String[] args) {
	int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, }, { 9, 10, 11, 12, }, { 13, 14, 15, 16, } };
	rotateBy90degree(a);
}

public static void rotateBy90degree(int a[][]) {
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(i<j) {
			int b=a[i][j];
		  a[i][j]=a[j][i];
	      a[j][i]=b;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length/2;j++) {
			
			int temp=a[i][j];
			a[i][j]=a[i][(a.length)-j-1];
			a[i][(a.length)-j-1]=temp;
			}
		
		}
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[i][j]+" ");
			}
		System.out.println();
		}
}
}
