import java.util.Scanner;

public class Division {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the dividend (num1): ");
       double num1 = sc.nextDouble();
       
       System.out.println("Enter the divisor (num2): ");
       double num2 = sc.nextDouble();
       
       double Q = num2 != 0 ? num1 / num2 : Double.NaN;
       double R = num2 != 0 ? num1 % num2 : Double.NaN;

       if (!Double.isNaN(R)) {
           System.out.printf("The remainder for the dividend %.2f and the divisor %.2f is %.2f%n", num1, num2, R);
       } else {
           System.out.println("Zero division error occurred!!");
       }

       if (!Double.isNaN(Q)) {
           System.out.printf("The quotient for the dividend %.2f and the divisor %.2f is %.2f%n", num1, num2, Q);
       } else {
           System.out.println("Zero division error occurred!!");
       }

       sc.close();
   }
}
