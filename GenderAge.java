package challenges;

import java.util.Scanner;

public class GenderAge {
	
	public static int calculateAge(int age) {
		if(age>=0 && age<18) {
			String agecategory="child";
		}else if(age>=18 && age<60) {
			String agecategory="adult";
		}else if(age>=60) {
			String agecategory="Senior Citizen";
		}else {
			System.out.println("Invalid age input");
		}
		return age;
	}
	
	public static String findGender(char gender) {
		String genderVal;
		if(gender=='M') {
			genderVal="Male";
			
		}else {
			genderVal="Female";
		}
		
		return genderVal;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		System.out.println("Enter the gender");
		char gender=sc.next().charAt(0);
		
		int ageres=calculateAge(age);
		System.out.println("User age is: "+ageres);
		
		String genderres=findGender(gender);
		System.out.println("User gender is: "+genderres);
	}
}
