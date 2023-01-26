package prg.org;

import java.util.Random;

public class GenerateRandomNumbers {
	public static void main(String[]args) {
		Random ra=new Random();
		System.out.println(ra.nextInt(10));
		
		System.out.println(ra.nextDouble());
	}

}


