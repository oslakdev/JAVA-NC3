public class Task3 {

    public static void main(String[] args) {
        System.out.println("=============================================");
        System.out.println("Task3:\nChange the variables in the next section, \nso each statements resolves as true");
        System.out.println("=============================================\n");

        String a = new String("Wow");
        String b = "Wow";
        String c = a; 
        String d = c; 

        boolean b1 = a != b; // changed to == to != to make it true.
        //System.out.println(b1);
        boolean b2 = d.equals(b); // changed (b + "!") to (b) to make it true.
        //System.out.println(b2);
        boolean b3 = c.equals(a); // changed !c.equals to c.equals to make it true.
        //System.out.println(b3);

        if (b1 && b2 && b3){
            System.out.println("Success!\n");
        }


    }
}
