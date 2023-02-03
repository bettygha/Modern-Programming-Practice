package lesson9_StreamExcersice;

public class MyTriFunction implements TriFunction<Integer, Integer, Integer, Integer>{

	@Override
	public Integer apply(Integer s, Integer t, Integer z) {
		
		return s * t * z;
	}
	public static void main(String[] args) {
		MyTriFunction myTriFunction = new MyTriFunction();
		
		System.out.println(myTriFunction.apply(2, 2, 2));
	}

}
