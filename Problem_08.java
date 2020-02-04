
package problem_oop1;

import java.util.Scanner;

public class Problem_08 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter The number : ");
       double num = input.nextDouble();       
        if (num%2==0) {
            System.out.println("The number is even");
        } 
        else 
        {
            System.out.println("The number is odd");
        }
    }

}
