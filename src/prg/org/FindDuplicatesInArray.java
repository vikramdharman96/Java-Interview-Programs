package prg.org;

public class FindDuplicatesInArray {
	public static void main(String[]args) {
		String a[]= {"java","c","python","java"};
		
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if (a[i]==a[j]) {
					System.out.println("Duplicates found: "+a[i]);
					flag=true;
				}
			}
		}
		if (flag==false) {
			System.out.println("Duplicates not found");
		}
	}

}
