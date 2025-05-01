public class Tasksheet_1_1_3 {
    
    public static void main(String[] args) {
        
        int check_number = 10;
        String message;

        for (int i = 1; i <= check_number; i++) {
            if (i % 2 == 0){
                message = "is even number"; 
                }
            else{
                message = "is odd number";
            }
        System.out.println(i + " " +message);    
        }

    }

}

    

