package FIMethods;

import java.util.function.Consumer;

interface Myinterface{
	public void someMethod(String name);
}


public class Mymethodref {
	public static void main(String[] args) {
		Myinterface mymy = (a) -> {System.out.println(a);};
		mymy.someMethod("HCL");
		
		Myinterface mymy1 = System.out :: println;
		mymy1.someMethod("Java CoE");
		
		Consumer<String> consumer = System.out::println;
		consumer.accept("Bye");
		
		//classname or interfacename :: methodname
		
		
	}
}
