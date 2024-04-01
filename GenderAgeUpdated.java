package challenges;

import java.util.Scanner;

public class GenderAgeUpdated {
	
	public static int[] AgeGenderCheck(int age, char gender) {
		
		if(gender=='M' && age>=0 && age<18) {
			System.out.println("Its a boy.!");
			return new int[] {age,gender};
			
		}else if(gender=='M' && age>=18 && age<60) {
			System.out.println("Its an Man.!");
			return new int[] {age,gender};
			
		}else if(gender=='M' && age>=60) {
			System.out.println("Its a Senior Citizen.!");
			return new int[] {age,gender};
			
		}else if(gender=='F' && age>=0 && age<18) {
			System.out.println("Its a girl.!");
			return new int[] {age,gender};
			
		}else if(gender=='F' && age>=18 && age<60) {
			System.out.println("Its a woman.!");
			return new int[] {age,gender};
			
		}else if(gender=='F' && age>=60) {
			System.out.println("Its a Senior Citizen.!");
			return new int[] {age,gender};
			
		}else {
			System.out.println("Invalid Inputs..!! Enter correct age and gender.!");
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		if(age<0) {
			System.out.println("Invalid age.! Enter correct age");
			return;
		}
		
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(0);
		
		int result[]=AgeGenderCheck(age,gender);
		System.out.println("Age is: "+result[0]);
		System.out.println("Gender is: "+(char)result[1]);

	}
}
