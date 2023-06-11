package dto;
import java.util.*;
import java.util.Scanner;

public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
        this.height = 0;
        this.width = 0;
        this.isWatercolour = false;
        this.isFramed = false;
    }

    public Painting(int value, String creator, int height, int width, boolean isWatercolour, boolean isFramed) {
        super(value, creator);
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isWatercolour() {
        return isWatercolour;
    }

    public void setWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isFramed() {
        return isFramed;
    }

    public void setFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    public void outputPainting() {
        output();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Watercolour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
    }

    public void inputPainting() {
        input();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter painting height: ");
                int height = Integer.parseInt(scanner.nextLine());
                if (height > 0) {
                    setHeight(height);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for the height.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for the height.");
            }
        }

        while (true) {
            try {
                System.out.print("Enter painting width: ");
                int width = Integer.parseInt(scanner.nextLine());
                if (width > 0) {
                    setWidth(width);
                    break;
                } else {
                    System.out.println("Invalid input. Please enter a positive integer for the width.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer for the width.");
            }
        }
        while (true) {
            try {
                System.out.print("Is the painting a watercolour (true/false)? ");
                setWatercolour(scanner.nextBoolean());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter 'true' or 'false' for the watercolour value.");
                scanner.nextLine(); // clear the invalid input from the scanner buffer
            }
        }

        while (true) {
            try {
                System.out.print("Is the painting framed (true/false)? ");
                setFramed(scanner.nextBoolean());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter 'true' or 'false' for the framed value.");
                scanner.nextLine(); // clear the invalid input from the scanner buffer
            }
        }
    }
}

