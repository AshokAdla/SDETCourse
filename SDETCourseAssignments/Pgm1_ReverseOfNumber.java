package SDETCourseAssignments;

public class Pgm1_ReverseOfNumber {
	
	public static int ReverseOfNumber(int num) {
		int remainder,rev = 0;
		while(num!=0) {
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		return rev;
	}
	
	public static void main(String[] args) {
		int N1=123;
		int reverse=ReverseOfNumber(N1);
		System.out.println("Reverse Of Number1: "+reverse);
		
		int N2=234;
		int reverse2=ReverseOfNumber(N2);
		System.out.println("Reverse Of Number2: "+reverse2);
	}

}
