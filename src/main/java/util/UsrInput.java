package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public float getPrice(int itemNumber) {
            System.out.format("Enter the price of item %d: ", itemNumber);
            return input.nextFloat();
    }

    static public int getQuantity(int itemNumber) {
        System.out.format("Enter the quantity of item %d: ", itemNumber);
        return input.nextInt();
    }
}
