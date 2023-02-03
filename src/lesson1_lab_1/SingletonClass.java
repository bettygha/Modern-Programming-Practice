package lesson1_lab_1;

public class SingletonClass {

	private String nameString ;
	private SingletonClass(String nameString) {
		this.nameString = nameString;
		
	}
	public static SingletonClass newSingletonClass(String nameString) {
		return new SingletonClass(nameString);
		
	}
}
