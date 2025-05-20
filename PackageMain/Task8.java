public class Task8 {

    //         Write a program featuring an integer variable arguments method. The method should return the sum of all parameters and, for each parameter, 
    //         the cumulative sum up to that point. For instance, given parameters (4, 5, 10), 
    //         the program should compute the total for the first parameter, such as 4 = (1+2+3+4), 
    //         and repeat this process for subsequent parameters.
             
    
    public static void main(String[] args) {
        //

    }
    
  
    public static void processNumbers(int... numbers) {
        int totalSum = 0;
        System.out.println("Processing numbers: " + arrayToString(numbers));
        
        // Calculate and display cumulative sum for each number
        for (int num : numbers) {
            int cumulativeSum = calculateCumulativeSum(num);
            System.out.printf("Cumulative sum up to %d: %d%n", num, cumulativeSum);
            totalSum += num;
        }
        
        // Display the sum of all parameters
        System.out.printf("Sum of all parameters: %d%n", totalSum);
        System.out.println(); // Add blank line for separation
    }
    
   
    private static int calculateCumulativeSum(int n) {
        // Using the formula for sum of first n natural numbers: n(n+1)/2
        return n * (n + 1) / 2;
    }
    
  
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
