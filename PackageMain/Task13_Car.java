    // 1. Create a base class called Vehicle with the following attributes:
    //     = make(string): The make of the vehicle.
    //     = mdel(string): The model of the vehicle.
    //     = year(int): The manufacturing year of the vehicle.
    // 2. Create a derived class called Car that extends the Vehicle class. The Car class should have an
    //     additional attribute:
    //     =numberOfDoors(int): The number of doors in the car.
    // 3. Create an instance of the Car class and set the values for its attributes.
    // 4. Implement a method in the Car class called displayDetails() that prints
    //     out the details of the car, including the inheritted attributes from the Vehicle class.

    // Sample output:

    // Car Details:
    // Make: Toyota
    // Model: Camry
    // Year: 2022
    // Number of Doors: 4


public class Task13_Car extends Vehicle{

    int numberOfDoors;

    //constructor extends vehicle clas
    public Task13_Car(String make, String model, int year, int numberOfDoors) { 
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    public void displayDetails(){
        System.out.println("===============");
        System.out.println("Car Details:" + "\nMake: " +make + "\nModel: " +model + "\nYear: "+year+"\nNumber of Doors: "+ numberOfDoors);
        System.out.println("===============");
    }    
    public static void main(String[] args) {
    
    //instantiate car
    Task13_Car car = new Task13_Car("Toyota", "Camry", 2022, 4);

    car.displayDetails(); //call car method.

    }
}
