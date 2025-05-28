// in java programing, create a gorilla class which impliments the animal interface.
// add this comment inside appropriate methods:
// //lather, rinse, repeat
// //pet at your own risk
// //put gorilla food into cage

// interface Animal {
// boolean feed(boolean timeToEat);
// void groom();
// void pet();
// }


public class Task16_Gorilla implements Animal{

    static Task16_Gorilla gorilla = new Task16_Gorilla();

    
    @Override
    public boolean feed(boolean timeToEat) {
        if (timeToEat);
        // Put gorilla food into cage.
        System.out.println("time to feed the gorilla.");
        return true;
    }

    @Override
    public void groom() {
        // lather, rinse, repeat
        System.out.println("Grooming the gorilla.");
    }

    @Override
    public void pet() {
        // pet at your own risk
        System.out.println("Petting the gorilla.");
    }

    public static void main(String[] args) {
    
        gorilla.feed(true);
        gorilla.groom();
        gorilla.pet();

    }

}
