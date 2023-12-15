package Week4.Day1classroom;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		Set<String> mentors =new HashSet<String>();
		mentors.add("Vidya");
		mentors.add("Aravind");
		mentors.add("Princilla");
		mentors.add("Subraja");
		mentors.add("Princilla");
		
		System.out.println(mentors);
		
		Set<String> mentorName=new LinkedHashSet<String>(mentors);
		mentorName.add("Raghu");
		mentorName.add("Jagadeeesh");
		System.out.println(mentorName);
		
		Set<String> mentNam=new TreeSet<String>(mentorName);
		mentNam.add("Ajay");
		System.out.println(mentNam);
		 
	}

}
