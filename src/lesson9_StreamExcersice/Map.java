package lesson9_StreamExcersice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		List<Integer> numIntegers = Arrays.asList(1,2,3,4);
		
		Stream myStream = numIntegers.stream().map(x->x.intValue()* 2 );
		
		//myStream.forEach(System.out::println);
		
		List<Integer> coList = numIntegers.stream().map(x->x.intValue()* 2 ).collect(Collectors.toList());
		
		System.out.println(Arrays.toString(coList.toArray()));
	}

}
