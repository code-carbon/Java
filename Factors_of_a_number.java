package Math_works;
import java.util.Scanner;
public class Factors_of_a_number {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    System.out.print("Factors of " + number + " are: ");
        for(int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
    }
  }
}
