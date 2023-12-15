package Week4.Day1classroom;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {

		String sentence = "Learning Selenium in Selenium Java Selenium Session";

		String[] split = sentence.split(" ");

		// [Learning,in,Selenium,Java,Session]

		Set<String> unique = new LinkedHashSet<String>();
		Set<String> dup = new LinkedHashSet<String>();

		for (int i = 0; i <= split.length - 1; i++) {
			if (!unique.add(split[i])) {
				// if the dup word is not added to the unique set
				// then add to the dup set
				dup.add(split[i]);
			}
		}

		System.out.println(unique);
		System.out.println(dup);

		// Learning, in,selenium,java session
		// Learning in java session

		unique.removeAll(dup);
		System.out.println(unique);

	}

}
