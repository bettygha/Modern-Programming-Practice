package lesson9_Lab_Assignment;

import java.util.List;
import java.util.stream.Stream;

public class partTwo {
	public static void main(String[] args) {
		
		Stream stringStream = Stream.of("A","good","day","to","write","some","java");
		
		String reducedString = (String) stringStream.reduce("",(x,y)-> x + " " + y);
		
		System.out.println(reducedString);
		
		
		
	}
	public int countWords(List<String> wordStrings , char c , char d , int len ) {
		long count = wordStrings.stream().
				    filter(w -> w.length() == len && w.indexOf(c) != -1 && !(w.indexOf(w) != -1)).
				    count();
		
		return (int) count;
				
	}
	

}
