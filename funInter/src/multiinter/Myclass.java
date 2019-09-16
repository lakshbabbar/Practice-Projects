package multiinter;

public class Myclass {

	
	public String sayHello(String name) {
		return name;
	}
	
	public static void main(String[] args) {
		Myinter myobj = (name) -> (name + "world");
		
		System.out.println(myobj.sayHello("Hello"));
		System.out.println(Myinter.add(12, 33));
		System.out.println(myobj.defaultmethod(10));
		Myinter obj2 = (name) -> (name + "world");
		System.out.println(myobj);
		System.out.println(obj2);
		System.out.println(myobj.equals(obj2));
		
	}

}
