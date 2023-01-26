package prg.org;

public class Swapping2Number {

	public static void main(String[]args) {
		
		//Logic1 - Using 3rd variable
		int a=20;  int b=10;
		
//		int t=a;
//		a=b;
//		b=t;

		
		//Logic2 without 3rd variable
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println();
		
		System.out.println("After swapping: "+a+" "+b);
		
		
		
				
		
	}
}
