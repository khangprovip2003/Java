package dto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Statue extends Item {
    private int weight;
    private String colour;

    public Statue() {
        super();
        this.weight = 0;
        this.colour = "";
    }

    public Statue(int value, String creator, int weight, String colour) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void outputStatue() {
        output();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
    }

    public void inputStatue() {
        input();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter status weight: ");
                int weight = Integer.parseInt(scanner.nextLine());
                if (weight > 0) {
                    setWeight(weight);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for the weight.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for the weight.");

            }
        }


        while (true) {
            System.out.print("Enter status colour: ");
            String colour = scanner.nextLine();
            if (!colour.isEmpty()) {
                setColour(colour);
                break;
            } else {
                System.out.println("Invalid input. Please enter a non-empty colour.");
            }
        }
    }

}
