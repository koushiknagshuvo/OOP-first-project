
package problem_oop1;

import java.util.Scanner;

public class Problem_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       System.out.println("First 100 positive numbers : "); 
       int sum = 0;
        for (int i = 1; i <=100; i++) {
            System.out.println(i);
            sum =sum+i;
        }                    
         System.out.println("sum of all number : "+sum);      
          
    }
}
