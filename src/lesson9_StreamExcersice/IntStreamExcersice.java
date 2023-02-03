package lesson9_StreamExcersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamExcersice {
	public static void main(String[] args) {
		int[] values = {1,2,3,4,5,6,7,8};
		
	
		
		IntStream.range(9, 11).
		forEach(System.out::println);
		
		List<String> strings = Arrays.asList("1","2","3");
		

		List<Integer> intsIntegers = Arrays.asList(3,2,4,5,8);
		List<int[]> intArrsList = intsIntegers.stream().
				map(len-> new int[len]).collect(Collectors.toList());
		
		
		
		List<String> intArrsStrings = intArrsList.stream().
				map(Arrays::toString).collect(Collectors.toList());
		//question 1
		//List<> flatedList = intArrsList.stream().
			//	flatMap(s-> Arrays.stream(s)).collect(Collectors.toList());
				
		//System.out.println(flatedList);
		
		List<String> strings2 = Arrays.asList("A","B","C");
		
		// question 2
		String[] strgArrayStrings =  strings2.stream().toArray(String[]::new);
		
		List<String> list = Arrays.asList("joe","tom","abe");
		
		Stream<Stream<Character>> resultStream = list.stream().map(s->characterStream(s));
		
		List<Character> flattedCharacters = list.stream().
				flatMap(s->characterStream(s)).collect(Collectors.toList());
		
		
		List<String> wordStrings = Arrays.asList("Tom","Joseph","Richard");
		
		Stream<String> longestFirStream = wordStrings.stream().
		                                  sorted((String x, String y)-> 
		                                	  new Integer(y.length()).compareTo(new Integer(x.length()))
		                    
		                                  );
		System.out.println(longestFirStream.collect(Collectors.toList()));
		                                  
		
	};
	

	private static Stream<Character> characterStream(String s) {
		// TODO Auto-generated method stub
		List<Character> resultCharacters = new ArrayList<>();
		
		for(char x : s.toCharArray()) {
			resultCharacters.add(x);
		}
		return resultCharacters.stream();
	}

}
