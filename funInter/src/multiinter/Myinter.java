package multiinter;


public interface Myinter {

	public String sayHello(String name);
	
	public static int add(int num1,int num2){return num1+num2;}
	
	boolean equals (Object obj);
	
	default public int defaultmethod(int var){
		return var+100;
	}
}
