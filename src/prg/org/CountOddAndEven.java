package prg.org;

public class CountOddAndEven {
	public static void main(String[]args) {
		int num=12345623;
		
		int even_count=0;
		int odd_count=0;
		while(num>0) {
			int rem=num%10;  //get last digit
			if (rem%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
			 num=num/10;		//eleminate last digit
		}
		System.out.println("Even number: "+even_count);
		System.out.println("Odd number: "+odd_count);
	}

}
