package FIMethods;

public class InstanceMethodReference1 {

	public static void main(String[] args) {
		InstanceInterface interref = () -> {System.out.println("hello");};
		interref.myInterface();
		InstanceMethodReference methodref = new InstanceMethodReference();
		InstanceInterface interref2 = methodref::saySomething;
		interref2.myInterface();
}
}
