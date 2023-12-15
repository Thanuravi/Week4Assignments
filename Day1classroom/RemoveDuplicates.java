package Week4.Day1classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
String sentence="Learning Selenium in Selenium Java Session Selenium";
		
		String[] split = sentence.split(" ");
		
		//[Learning,Selenium,in,Selenium,Java,Session]
		
		Set<String> unique=new LinkedHashSet<String>();
		
		for(int i=0;i<=split.length-1;i++) {
				unique.add(split[i]);
		}
		
		
		System.out.println(unique);
		/*
		 * for(int i=0;i<unique.size();i++) { System.out.print(unique.get(i) +" "); }
		 */
	
		//advanced forloop-for each
		//for(datatype variable:collection){}
		for(String name:unique) {
			System.out.print(name+ " ");
		}
		
		
		
		
	}

	}


