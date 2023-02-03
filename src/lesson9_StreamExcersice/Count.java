package lesson9_StreamExcersice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PrimitiveIterator.OfDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Count {
	
	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		
		long size = myList.stream().filter(e -> e.toString().length()>=1).count();
		System.out.println(size);
		
		Integer[] arrOfIntegers = {1,2,3,4};
		Stream<Integer> myStream = Stream.of(arrOfIntegers);
		
		System.out.println("Count= "+ myStream.count());
		
		//Collections of Arrays to stream
		int[] arrOfInt1 = {1,2,3,4};
		int[] arrOfInt2 = {1,2,3,4};
		Stream<int[]> int2 = Stream.of(arrOfInt1);//can hold multipel lists
		Stream<int[]> int3 = Stream.of(arrOfInt1,arrOfInt2);
		
		int3.forEach(x -> System.out.println(Arrays.toString(x)));
		
		//more efficient than Stream<Integer> 
		IntStream collIntStream = IntStream.of(10,12,34,56);
		long l = collIntStream.filter(x-> (x%2 != 0)).count();
		System.out.println(l);
		
		
		
		
	}

}
