 /*Task5
  * Check whose largest number in 3 inputs.
    Create a program that takes in three input number from user
    and output the largest number. If all numbers are equall print "all numbers are equal".
  */


import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scann = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        
        System.out.print("Please enter number1: ");
        int number1 = scann.nextInt();
        num1 = number1;

        System.out.print("Please enter number2: ");
        int number2 = scann.nextInt();
        num2 = number2;
        
        System.out.print("Please enter number3: ");
        int number3 = scann.nextInt();
        num3 = number3;

        scann.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 +" is the greatest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 +" is the greatest");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3 +" is the greatest");
        }else if(num1 == num2 && num1 == num3 ){
            System.out.println(num1 + " " + num2 +"" + "and " + num3 + " are all equal");
        }
    }

   
}
