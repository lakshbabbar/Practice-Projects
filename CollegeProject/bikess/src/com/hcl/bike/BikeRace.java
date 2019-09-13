package com.hcl.bike;

import java.util.Scanner;

public class BikeRace {

	public int calculate(){
		System.out.println("Enter the distance travelled");
		Scanner sc= new Scanner(System.in);
		int odd=1,even=1,i=0;
		String dist = sc.nextLine();
		char[] c = dist.toCharArray();
		int l = c.length;
		while(i<l){
			odd=odd*(Integer.parseInt(""+c[i]));
			even=even*(Integer.parseInt((""+c[i+1])));
			i=i+2;
		}
		if(odd>even){
			return odd;
		}else{
			return even;
		}
	}
	
	public static void main(String[] args) {
		BikeRace br = new BikeRace();
		int j = br.calculate();
		System.out.println("Your bonus points is "+j);
	}
}
