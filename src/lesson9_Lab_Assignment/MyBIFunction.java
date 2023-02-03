package lesson9_Lab_Assignment;

import java.util.function.BiFunction;

public class MyBIFunction implements BiFunction<Integer, Integer, Integer> {
	public static void main(String[] args) {
		
		MyBIFunction myBIFunction = new MyBIFunction();
		System.out.println(myBIFunction.apply(2, 3));
	}

	@Override
	public Integer apply(Integer t, Integer u) {
	
		return t.intValue() * u.intValue();
	}

}
