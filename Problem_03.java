
package problem_oop1;

import java.util.Scanner;

public class Problem_03 {
    public static void main(String[] args) {
        double PI = 3.1416;
        Scanner input = new Scanner (System.in);
       System.out.print("Enter the radius  : ");
       double r = input.nextDouble();
       double area = PI*r*r;
       double circumference =2*PI*r;
       System.out.println("The area of the circle : "+area);
       System.out.println("The area of the circle : "+circumference);
    }
}
