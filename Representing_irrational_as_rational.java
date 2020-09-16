package Math_works;
import java.util.Scanner;
public class Representing_irrational_as_rational {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	float base = sc.nextFloat();
	int rep = sc.nextInt();
	double den = Math.pow(10,rep);
	float num = (float)((base*den)-base);
	System.out.println(">>> "+Math.round(num)+" / "+Math.round((den-1)));
	}
}
