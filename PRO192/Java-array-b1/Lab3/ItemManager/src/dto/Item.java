package dto;

import java.util.*;

public class Item {
    protected int value;
    protected String creator;

    public Item() {
        value = 0;
        creator = "";
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter item value: ");
                int value = Integer.parseInt(scanner.nextLine());
                if (value > 0) {
                    setValue(value);
                    break;
                } else {
                    System.out.print("Invalid input. Please enter a positive value: ");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter an integer value.");

            }
        }
        while (true) {
            System.out.print("Enter item creator: ");
            String creator = scanner.nextLine();
            if (!creator.isEmpty()) {
                setCreator(creator);
                break;
            } else {
                System.out.println("Invalid input. Please enter a non-empty colour.");
            }
        }
    }

    public void output() {
        System.out.println("Item value: " + getValue());
        System.out.println("Item creator: " + getCreator());
    }

}
