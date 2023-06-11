package dto;

import java.util.*;

public class Vase extends Item {
    private int height;
    private String material;

    public Vase() {
        super();
        this.height = 0;
        this.material = "";
    }

    public Vase(int value, String creator, int height, String material) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void inputVase() {
        input();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter vase height: ");
                int height = Integer.parseInt(scanner.nextLine());
                if (height > 0) {
                    setHeight(height);
                    break; // exit the loop after successfully setting the height field
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for the height.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for the height.");
            }
        }

        while (true) {
            System.out.print("Enter vase material: ");
            String material = scanner.nextLine();
            if (material.isEmpty()) {
                System.out.println("Invalid input. Please enter a non-empty material.");
            } else {
                setMaterial(material);
                break; // exit the loop after successfully setting the material field
            }
        }
    }


    public void outputVase() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
    }
}
