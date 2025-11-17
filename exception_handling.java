import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            System.out.print("Enter numerator: ");
            int num = input.nextInt();
            
            System.out.print("Enter denominator: ");
            int den = input.nextInt();
            
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Program finished.");
            input.close();
        }
    }
}
