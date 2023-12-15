package Week4.Day1classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueSet {

	public static void main(String[] args) {
		
		String companyName="Google";
		
		char arr[]=companyName.toCharArray();
		
		Set<Character> unique=new LinkedHashSet<Character>();
		
		for(int i=0;i<=arr.length-1;i++) {
				unique.add(arr[i]);
		}
		
		
		
		
		for(Character name:unique) {
			System.out.print(name);
		}
	}
}
		
		
		
	

	


