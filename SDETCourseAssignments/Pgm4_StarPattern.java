package SDETCourseAssignments;

public class Pgm4_StarPattern {
	public static void main(String[] args) {
		int rows=5;
		int k=rows;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int m=1;m<=k;m++) {
			for(int n=1;n<=k-m;n++) {
				System.out.print("*");
			}
			System.out.println();
			
			
			
			
		}
	}
}
