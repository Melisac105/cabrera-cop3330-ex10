package util;

import java.util.Scanner;

public class UsrInput {
    static Scanner input = new Scanner(System.in);

    static public String getPrice(int itemNumber) {
            System.out.format("Enter the price of item %d: ", itemNumber);
            return input.nextLine();
    }

    static public String getQuantity(int itemNumber) {
        System.out.format("Enter the quantity of item %d: ", itemNumber);
        return input.nextLine();
    }
}
