package prg.org;

public class SumofArray {
	public static void main(String[]args) {
		int a[]= {5,2,3,1,3};
		
		int sum=0;
		//noraml forloop
		for(int i=0;i<=a.length-1;i++) {
			
			sum=sum+a[i];
		}
		System.out.println("Sum of Array: "+sum);
		
//		//enhanced forloop
//		for(int value:a) {
//			sum=sum+value;
//		}
//		System.out.println("Sum of Array: "+sum);
//		
	}

}
