package lesson9_StreamExcersice;


import java.util.function.BiFunction;
import java.util.function.Function;

import lesson1_Design_2.ItemCopy;

public class MethodReference {
	public static void main(String[] args) {
		//imparative style
		
		char[] charArray = {'s','p','e'};
		String string = new String(charArray);
		
		//Item ob1 = new Item ("name",12.0);
		
		//lambda
		
		Function<char[], String> objFunction = (x)-> new String(x);
		
		//BiFunction<String, Double, Item> ob2 = (n,p)->new Item(n,p);
		//method reference Class::new

		
		Function<char[], String> objFunction2 = String::new;
		//BiFunction<String, Double, Item> ob3 = Item::new;
		
		System.out.println(objFunction.apply(charArray));
		System.out.println(objFunction2.apply(charArray));
		
		
	}

}
