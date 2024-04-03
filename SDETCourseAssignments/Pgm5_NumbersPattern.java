package SDETCourseAssignments;

public class Pgm5_NumbersPattern {
	public static void main(String[] args) {
		int rows=7;
		int matrix[][]=new int[rows][rows];
		
		int num=rows/2+1;
		int start=0;
		int end=rows-1;
		
		while(num>=1) {
			for(int i=start;i<=end;i++) {
				for(int j=start;j<=end;j++) {
					matrix[i][j]=num;
				}
			}
			num--;
			start++;
			end--;
		}
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<rows;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
