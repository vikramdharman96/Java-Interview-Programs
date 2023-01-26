package prg.org;

public class CountNumberOfDigitsInNumber {
	public static void main(String[]args) {
		
		int num=135;
		
		int count=0;
		while(num>0) {
			
			num=num/10;  //eleminate last digit
			count++;		//add num in variable
		}
		
		System.out.println(count);
	}

}
