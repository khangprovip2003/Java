import data.*;

import data.Printable;

public class Main {
    public static void main(String[] args) {

//        Printable lambdaPrintable = () -> System.out.println("Meow3 " + s);
//        printThing(lambdaPrintable);
//  or
//        Printable lambdaPrintable2 = s -> System.out.println("Meow3 " + s);
//        printThing(lambdaPrintable2);
                /////////////////////
//        Printable lambdaPrintable = (p,s) -> System.out.println( p + " Meow3 " + s);
//        printThing(lambdaPrintable);
                /////////////////////
        Printable lambdaPrintable = (s) -> {
            return "Meow3 " + s;
        };
        printThing(lambdaPrintable);
// or
        Printable lambdaPrintable2 = (s) ->  "Meow3 " + s;
        printThing(lambdaPrintable2);




    }

    public static void printThing(Printable thing){
//            thing.print("!");
//        thing.print("!", "hi");
        thing.print("hello");




    }



}