package prg.org;

public class EvenandOddNumberInArray {
	public static void main(String[]args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even numbers");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("Odd Number");
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}

//		//enhanced forloop
//		System.out.println("Even");
//		for(int value:a) {
//			if(value%2==0) {
//				System.out.println(value);
//			}	
//		}
//		System.out.println("Odd");
//		for(int value:a) {
//			if(value%2!=0) {
//				System.out.println(value);
//			}	
//		}
		
		
		
	}
	
}	
