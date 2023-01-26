package prg.org;

import java.util.Scanner;

public class PalindromeNUmber {
	
	public static void main(String[]args) {
		System.out.println("Enter num");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int org_num=num;
		
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10; //get last digit
			num=num/10;    //remove last digit
		}
		if (org_num==rev) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		
	
		

	}

}
