package prg.org;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args) {
		
		//Using Algorith
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int rev=0;   //third variable
		while (num!=0) {
			rev=rev*10 + num%10; //get last digit
			num=num/10; //eleminate last digit
		}
		System.out.println(rev);
		//Using StringBuffer Class
		
//		StringBuffer sb=new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);

		//Using StringBuilder class
//		StringBuilder sbu=new StringBuilder(); 
//		StringBuilder append = sbu.append(num);
//		StringBuilder reverse = append.reverse();
//		System.out.println(reverse);
//	
	
	}


}
