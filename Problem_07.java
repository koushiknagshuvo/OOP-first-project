
package problem_oop1;

import java.util.Scanner;

public class Problem_07 {   
        public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.print("Enter 2 numbers : ");
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double sub1 = num1-num2;
       double sub2 = num2-num1;
       
        if (num1>num2) {
            
            System.out.println("Result is :"+sub1);
        } 
        else 
        {
            System.out.println("Result is :"+sub2);
        }
    }

    }

