
package problem_oop1;

import java.util.Scanner;

public class Problem_04 {
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
       System.out.print("Enter 2 numbers : ");
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
        if (num1>num2) {
            System.out.println("First number is large nuber:"+num1);
        }        
    }
}
