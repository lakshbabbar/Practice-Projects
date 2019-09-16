package FIMethods;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		Integer ans = calc1.calc((x,y) -> x+y,10,5);
		System.out.println(ans);
	}
}
