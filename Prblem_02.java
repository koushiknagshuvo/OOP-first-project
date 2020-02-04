
package problem_oop1;

import java.util.Scanner;

public class Prblem_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.print("Enter 2 numbers : ");
       double num1 = input.nextDouble();
       double num2 = input.nextDouble();
       double sum = num1+num2;
       double pro = num1*num2;
       double dif = num1-num2;
       
       
       System.out.println("sum of the number is : "+sum);
       System.out.println("product of the number is : "+pro);
       System.out.println("difference of the number is : "+dif);
    }
}
