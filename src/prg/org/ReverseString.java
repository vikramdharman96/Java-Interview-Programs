package prg.org;

public class ReverseString {
	public static void main(String[] arg) {
		
		String name = "Vikram";
		String reverse = "";		
		//1. Using charAt
		for (int i = name.length() - 1; i >= 0; i--) {
			char c = name.charAt(i);
			reverse = reverse + c;
		}
		System.out.println(reverse);
		
//		//2. Using tocharArray
//		char a[]=name.toCharArray();
//		int length = a.length;
//		
//		for(int i=length-1;i>=0;i--) { \\\\\\\\\\\\\\\\\\\\\
//			reverse=reverse+a[i];
//	}
//		System.out.println(reverse);  
		
//		//3. Using String Buffer
//		StringBuffer sb=new StringBuffer(name);
//		System.out.println(sb.reverse());
		
		
}
}