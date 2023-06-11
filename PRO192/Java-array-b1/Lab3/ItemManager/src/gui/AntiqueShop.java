package gui;

import java.util.*;

import dto.*;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            String[] options = {"Create a Vase", "Create a Statue", "Create a Painting", "Display the Item"};
            choice = Menu.getChoice(options);
            switch (choice) {
                case 1:
                    item = new Vase();
                    ((Vase) item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue) item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting) item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase) item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue) item).outputStatue();
                        else if (item instanceof Painting)
                            ((Painting) item).outputPainting();
                    } else {
                        System.out.println("You need to create an object.");
                    }
                    break;
                default:
                    System.out.println("!Please choose (1,2,3,4) option!!!");
                    break;
            }
        } while (choice <= 4);
    }

}