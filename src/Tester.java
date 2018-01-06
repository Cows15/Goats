public class Tester {


    public static void main(String[] args) {
        new Tester();
    }

    public Tester() {
        Goats gg = new Goats("John");
        GoatShelter gs = new GoatShelter(6, 6, 6);
        System.out.println(description(gg));
        System.out.println(description(gs));

    }

    private String description(Describable d) {
        return d.getDescription();
    }

    {
        int h = 1236;
        byte b = (byte) h;
        System.out.println("Byte" + b);//explicit casting, byte is smaller than int so value becomes truncated
        //and -44 prints to console
    }
}
/*

====================================
POLYMORPHISM VIA IMPLEMENTING INTERFACES

3 CLASSES ONE INTERFACE

1 DRIVER(MAIN), TWO OTHER CLASSES IMPLEMENT METHOD FROM INTERFACE

GOATS AND GOATSHELTER BOTH HAVE CONSTRUCTORS WHICH PASS ARGS, PRIVATE INSTANCE VARIABLES
THESE IN TURN ARE DECLARED AND CALLED IN GETTER METHOD DESCRIPTION IN TESTER CLASS
THESE METHODS THAT ARE IMPLEMENTED FROM INTERFACE HAVE VARIABLES THAT ARE PASSED AS VALUES (STRINGS AND INTS)
WHENB CALLING THEM FROM MAIN VIA INSTANTIATION OF GOATS AND GOATSHELTER CLASSES
BOTH CLASSES ARE CONSIDERED OBJECTS

PRINTS WHATERVER YOU PASS TO GOATS CONSTRUCTOR, INT THIS CASE IT IS "JOHN
GOATSHELTER CONSTRUCTOR CALLS 3 INDIVIDUAL INT PARAMS, HEIGHT, WIDTH, LENGTH, 6 HIGH, 6 WIDE AND 6 LONG PRINT TO CONSOLE


=====================================

 */
