package FIMethods;

interface MethodRefStaticInterface{
	public String sayHello(Integer str);
	public static String someMethod(Integer num){
		return "Welcome static :" + num ;
	}
}

public class MethodRefStatic {

	public static void main(String[] args) {
		MethodRefStaticInterface static1 = (a) -> {return "Welcome :" +a;};
		System.out.println(static1.sayHello(22));
		
		MethodRefStaticInterface static2 = MethodRefStaticInterface::someMethod;
		System.out.println(static2.sayHello(423));
	}
}
