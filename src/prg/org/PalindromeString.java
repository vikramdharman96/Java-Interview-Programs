package prg.org;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[]args) {
		
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		
		String st=sc.next();
		String org_st=st;
		String rev="";
		
		for(int i=st.length()-1;i>=0;i--) {
			char ch=st.charAt(i);
			rev=rev+ch;
		}
		if(org_st.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
			
		}
		
		
		
		
		
	}

}
