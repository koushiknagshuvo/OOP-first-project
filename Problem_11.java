
package problem_oop1;
import java.util.Scanner;
public class Problem_11 {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       System.out.print("Enter 5 number : ");  
       int sum=0;
        for (int i = 0; i <5; i++) {
            int num = input.nextInt();  
            sum=sum+num;
        }      
        double avr =sum/5;
        System.out.println("Avarage number :"+avr);
    }
}
