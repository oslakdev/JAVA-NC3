import java.util.Scanner;

public class Task7 {
    /*Create a program where user inputs two numbers and perform 4 basic arithmetic operation
      using 4 methods with return types and print the results.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        

        System.out.println("Addition result: " + add(num1, num2));
        System.out.println("Subtraction result: " + subtract(num1, num2));
        System.out.println("Multiplication result: " + multiply(num1, num2));
        
        //check if divided to zero
        if (num2 != 0) {
            System.out.println("Division result: " + divide(num1, num2));
        } else {
            System.out.println("Cannot divide by zero");
        }
        
        scanner.close();
    }
    
    public static int add(int n1, int n2) {
        return n1 + n2;
    }
    
    public static int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }
    
    public static int divide(int n1, int n2) {
        return n1 / n2;
    }
}