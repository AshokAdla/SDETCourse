package SDETCourseAssignments;

public class Pgm2_DivisorsOfNumber {
	public static int[] FindDivisorsOfNumber(int num) {
		int arr[]=new int[num];
		int index=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				arr[index]+=i;
				index++;
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		int n=36;
		int result[]=FindDivisorsOfNumber(n);
		System.out.println("Divisors of numbers are:");
		for(int i=0;i<result.length-1;i++) {
			if(result[i]!=0) {
				System.out.print(result[i]+" ");
			}	
		}
	}
}
