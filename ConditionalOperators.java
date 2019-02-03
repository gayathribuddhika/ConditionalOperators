
package conditionaloperators;

import java.util.Scanner;
public class ConditionalOperators {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter your age:");
        int age= input.nextInt();
        //int age = 75;
        System.out.println(age>50 ? "You are Old":"You are Young");
    }
    
}
