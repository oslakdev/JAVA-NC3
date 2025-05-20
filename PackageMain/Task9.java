import static java.lang.Math.addExact;
import static java.lang.Math.subtractExact;
import static java.lang.Math.multiplyExact;
import static java.lang.Math.floorDiv;
import java.util.Scanner;

public class Task9 {
    public static Scanner scanner = new Scanner(System.in);
    
    // 
    //  Create a Java program that performs basic math operations (addition, subtraction, multiplication, division) using static imports for the Math class methods. 
    //  The program should have the following features:Define a class named Task9.Inside the class, create static methods for addition, subtraction, multiplication, 
    //  and division. Each method should take two parameters and return the result.
    //  Use static imports for the Math class methods (Math.addExact(), Math.subtractExact(), Math.multiplyExact(), Math.floorDiv()). In the main method, 
    //  demonstrate the use of these static methods by performing some math operations with different values.Display the results of each operation.
    //
    
    public static int addition(int a, int b) {
        return addExact(a, b);
        
    }

    public static int subtraction(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiplication(int a, int b) {
        return multiplyExact(a, b);
    }

    public static int division(int a, int b) {
        return floorDiv(a, b);
    }
    
    public static void main(String[] args) {
        // addition 10+20
        System.out.println("addition result: " +  addition(10,20));

        // subtraction 20-10
        System.out.println("subtraction result: " +  subtraction(20,10));


        // multiplication 10x10
        System.out.println("multiplication result: " +  multiplication(10,10));


        // division 100 / 20
        System.out.println("division result: " +  division(100,20));
        
    }



    

}
