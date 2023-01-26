package prg.org;

public class SumOfDigits {
	public static void main(String[]args) {
		int num=12345;
		
		int sum=0;
		while(num>0) {
			sum=sum+num%10; //get last digit and add
			num=num/10;  //eleminate last digit
		}
		System.out.println("Sum of Digits: "+sum);
	}

}
