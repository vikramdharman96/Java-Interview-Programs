package prg.org;

public class PrimeNumber {
	
	//Natural number >1
	//which has only 2 factors 1 and itself
	public static void main(String[]args) {
		int num=17;
		int count=0;
		if (num>1) {
			for(int i=1;i<=num;i++) {
				if (num%i==0) {            //17%1==0----remainder will be 0
					count++;
				}
			}
			if (count==2) {
				System.out.println("Prime number");
				
			} else {
				System.out.println("Not prime number");

			}
			
		} else {
			System.out.println("Not prime Number");
		}
	}

}
