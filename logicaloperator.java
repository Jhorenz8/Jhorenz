import java.util.Scanner;

public class LogicalOperatorsDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        
        if (num1 > 0 && num2 > 0) {
            System.out.println("Both numbers are positive.");
        } else {
            System.out.println("At least one number is not positive.");
        }
        
        if (num1 > 0 || num2 > 0) {
            System.out.println("At least one number is positive.");
        } else {
            System.out.println("Neither number is positive.");
        }
        
        if (!(num1 % 2 == 0)) {
            System.out.println("First number is odd.");
        } else {
            System.out.println("First number is even.");
        }
        
        input.close();
    }
}
