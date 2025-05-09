import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter new string: ");
        String input = scanner.nextLine();
        
        StringBuilder palindrome = new StringBuilder(input);
        String output = palindrome.reverse().toString();
        System.out.println("input: " + input);
        System.out.println("output: " + output);
        scanner.close();
        
        //ceck if palindrome or not.
        if(input.equals(output)){
            System.out.println("String input is a palindrome.");
        }else{
            System.out.println("String input is not a palindrome.");
        }
        
        

        
    }
}