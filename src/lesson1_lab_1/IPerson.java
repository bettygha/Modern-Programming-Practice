package lesson1_lab_1;

public interface IPerson {

	default void myDefault() {
		System.out.println("From Default Method. ");
	}
	static void myStatic () {
		System.out.println("From Static Method.");
	}
	abstract void myAbstract();
}
