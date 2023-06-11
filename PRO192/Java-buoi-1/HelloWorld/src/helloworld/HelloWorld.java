package helloworld;

public class HelloWorld {

    public static void main(String[] args) {
        int x = -1;
        System.out.println("-1<<1: " + (x << 1));
        System.out.println("-1>>1: " + (x >> 1));
        System.out.println("-1>>>1: " + (x >>> 1));
        System.out.println("-1<3: " + (x << 1));
        System.out.println("3|4: " + (3 | 4));
        System.out.println("3&4: " + (3 & 4));
        System.out.println("3^4: " + (3 ^ 4));
        System.out.println("3^4: " + (3 ^ 4));
        System.out.println("3^4: " + (3 ^ 4));
        System.out.println("3^4: " + (3 ^ 4));
        System.out.println("3^4: " + (3 ^ 4));
        System.out.println("3^4: " + (3 ^ 4));

        String S = "Hello";
        boolean result = S instanceof String;
        System.out.println("hello is an instance of String: " + result);
        System.out.println("");

    }

}
