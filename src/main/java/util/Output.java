package util;

public class Output {

    static public void printOutput(double subtotal, double tax, double total) {
        System.out.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);
    }
}
