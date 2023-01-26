package prg.org;

public class FactorailNumber {
	
	public static void main(String[]args) {
		int num=10;
		long factorial=1;
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println("Facorial of "+num+ " is "+factorial);
		
		

	}	
}

