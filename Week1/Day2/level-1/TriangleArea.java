import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter base of the triangle (in cm): ");
       double base = sc.nextDouble();

       System.out.print("Enter height of the triangle (in cm): ");
       double height = sc.nextDouble();

       double areaCm = 0.5 * base * height;
       double areaInches = areaCm * 0.155;

       double total_inches = height / 2.54;
       int feet = (int) (total_inches / 12);
    

       System.out.printf("The area of the triangle is %.2f sq.cm (%.2f sq.inches)%n", areaCm, areaInches);
       System.out.printf("Your height in cm is %.2f cm, which is %d feet and %.2f inches.%n", height, feet, total_inches);

       sc.close();
   }
}
