
// Write a program featuring an integer variable arguments method. The method should return the sum of all parameters and, for each parameter, 
            // the cumulative sum up to that point. For instance, given parameters (4, 5, 10), 
            // the program should compute the total for the first parameter, such as 4 = (1+2+3+4), 
            // and repeat this process for subsequent parameters.
            
public class Task8 {

            
    
    private static int computeCumulativeSum(int n) {
        return n * (n + 1) / 2;  
    }

    
    public static int sumCumulativeSums(int... numbers) {
        int totalSum = 0;
        
        System.out.println("Calculating cumulative sums for each input:");
        for (int num : numbers) {
            int currentCumulativeSum = computeCumulativeSum(num);
            System.out.printf("the cumulative sum of 1 to %d is: %d\n", num, currentCumulativeSum);
            totalSum += currentCumulativeSum;
        }
        
        return totalSum;
    }
         
    
    public static void main(String[] args) {
        
        int result = sumCumulativeSums(3, 5, 6);
        System.out.println("The total cumulative sum of all is: " + result);
    }
    
}
