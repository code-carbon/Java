package Math_works;
import java.util.Scanner;
public class Fibonacci_series {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int range = sc.nextInt(), num2 = 0, num1 = 1;
	System.out.print(0);
	for(int num3=0;num3<range;num3++) {
		num3 = num1 + num2;
		System.out.print(" "+num3);
		num1=num2;
		num2=num3;
	}
}
}
