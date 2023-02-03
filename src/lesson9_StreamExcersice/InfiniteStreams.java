package lesson9_StreamExcersice;

import java.util.stream.Stream;

public class InfiniteStreams {
	
	public static void main(String[] args) {
		
		// to generate infinite streams we use
		//generate and iterate 
		
		Stream.generate(()->"Java").limit(5)
		.forEach(System.out::println);
		
		//when you have any requirement we use iterate
		
		Stream.iterate(1, n -> n+2).skip(3).limit(5)
		.forEach(System.out::println);
		
	}

}
