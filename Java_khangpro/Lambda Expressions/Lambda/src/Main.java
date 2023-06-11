import data.*;
import data.Printable;

public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.print();  // method 1
        printThing(myCat); // method2 : Interface
        // method using Lambda
        printThing(
                () -> {
                    System.out.println("Meow1");
                }
        );
        // method simply Lambda expression
        printThing(() -> System.out.println("Meow2"));
        //
        Printable lambdaPrintable = () -> System.out.println("Meow3");
        printThing(lambdaPrintable);

    }

    public static void printThing(Printable thing){
        thing.print();
    }



}