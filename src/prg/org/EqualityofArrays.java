package prg.org;

import java.sql.Driver;

public class EqualityofArrays {
	public static void main(String[]args) {
		int a1[]= {1,2,3,4,5,10,7};
		int a2[]= {1,2,3,4,5,6,7};
//		boolean status = Arrays.equals(a1, a2);
//		System.out.println(status);
		
		boolean status=true;
		if (a1.length==a2.length) {
			for(int i=0;i<a1.length;i++){
				if (a1[i]!=a2[i]) {  
					status=false;
				}
			}  
		}else {
			status=false;
		}
		if(status==true) {
			System.out.println("Arrays are equal");			
		}
		else {
			System.out.println("Not Equal");
			
		}
					
	}
}
