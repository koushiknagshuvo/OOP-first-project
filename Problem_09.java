
package problem_oop1;

import java.util.Scanner;

public class Problem_09 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter how many number you want : ");
       int num = input.nextInt();
        System.out.println("The numbers are : ");
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }
         
}
