package lesson9_StreamExcersice;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreams {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(1,2,3);
		OptionalInt res = intStream.max();
		System.out.println(res.getAsInt());
		
		
		//to convert a primitive type stream to a stream of Objects , use the boxed() method
		
		Stream<Integer> integerStream = IntStream.range(0, 20).boxed();
		
		
	}
}
