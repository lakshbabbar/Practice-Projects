package FIMethods;

import java.util.function.BiFunction;

public class Calculator {
	
	public Integer calc(BiFunction<Integer, Integer, Integer> bi,Integer num1, Integer num2){
		return bi.apply(num1, num2);
	}

}
