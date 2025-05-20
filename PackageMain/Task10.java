public class Task10 {
    //
    // Write the method printFullName or getFullName of student which prints the full name of a student.
    //

    public static void main(String[] args) {
        Student[] students = new Student[]
        {
            new Student("Morgan", "Freeman"),
            new Student("Brad", "Pitt"),
            new Student("Kevin", "Spacey"),
        };

        for (Student student : students) {
            student.getFullName();
            
        }
        
    }
}
class Student{

    public String[] length;
    private String firstName;
    private String lastName;

    public Student(String fName, String lName){
        this.firstName = fName;
        this.lastName = lName;
        
    }
    public void getFullName(){
        System.out.println(this.firstName +" "+this.lastName); 
    }



}