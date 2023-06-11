public class Tester {
    public static void main (String[] args){
        Car c = new Car();
        c.pressAcceleratorButton();
        c.pressStartButton();
        c.outPut();

        Car c2 = new Car("red",100,true,true);
        c2.pressAcceleratorButton();
        c2.setColour("Black");
        System.out.println("Colour of c2:"+c2.getColour());
        c2.outPut();

    }

}
