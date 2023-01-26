package prg.org;



public class exampleprog {
////	public static int fibonacci(int n) {
////		if(n<=1)
////			return n;
////		return fibonacci(n-1)+fibonacci(n-2);
////	}
////	
////	public static void main(String[] args) {
////		int n=10;
////		System.out.println(fibonacci(n));
////
////	}
//	
//	//palindrome method
//	 public static boolean checkPalindromeStirng(String input) {
//		boolean result=true;
//		int length = input.length();
//		for (int i = 0; i < length/2; i++) {
//			if (input.charAt(i)!= input.charAt(length-i-1)) {
//				result=false;
//				break;
//				
//			}
//			 
//		}
//		return result;
//
//	}
	 public static void main(String[] args) {
		 int num=1234;
		 int rev=0;
		 while(num!=0) {
			 rev=rev*10+ num%10;
			 num=num/10;
		 }
		 System.out.println(rev);
	}
}
