package Math_works;

import java.util.Scanner;
import java.math.*;
public class Basic_calculator_for_school {
	public static void main(String[] args) {
		System.out.print(">>> ");
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		String chr = sc.next();
		float num2 = sc.nextFloat();
		switch(chr.charAt(0)) {
			case('+'):System.out.println(">>> "+(num1+num2));
					  break;
			case('-'):System.out.println(">>> "+(num1-num2));
			  		  break;
			case('*'):System.out.println(">>> "+(num1*num2));
					  break;
			case('/'):System.out.println(">>> "+(num1/num2));
			          break;
			case('@'):System.out.println(">>> "+(Math.sqrt(num1)));
					  System.out.println(">>> "+(Math.sqrt(num2)));
	          		  break;
			case('^'):System.out.println(">>> "+(Math.pow(num1,num2)));
					  break;
			case('!'):System.out.println(">>> "+(Math.floor(num1)));
			          System.out.println(">>> "+(Math.floor(num2)));
			  		  break;
			case('#'):System.out.println(">>> "+(Math.ceil(num1)));
			          System.out.println(">>> "+(Math.ceil(num2)));
			  		  break;
			case('%'):System.out.println(">>> "+(num1%num2));
			          break;
			default: System.out.println("\n           ~>>> HELP <<<~");
				     System.out.println("\n1) '+' : ADD");
					 System.out.println("2) '-' : SUBTRACT");
					 System.out.println("3) '*' : MULTIPLY");
					 System.out.println("4) '/' : DIVIDE");
					 System.out.println("5) '@' : ROOT");
					 System.out.println("6) '^' : POWER");
					 System.out.println("7) '!' : RTL (Round To Lowest)");
					 System.out.println("8) '#' : RTH (Round To Highest)");
					 break;
		}
	}
}
