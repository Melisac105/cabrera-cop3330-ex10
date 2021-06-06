package util;

public class Processing {

    static public double convertStringToIntPrice(String price) {
        return Double.parseDouble(price);
    }

    static public int convertStringToIntQuantity(String quantity) {
        return Integer.parseInt(quantity);
    }

    static public double calcSubtotal(double it1Price, int it1quant, double it2Price, int it2quant, double it3Price, int it3quant) {
        double item1FinalPrice = it1Price * it1quant;
        double item2FinalPrice = it2Price * it2quant;
        double item3FinalPrice = it3Price * it3quant;
        return item1FinalPrice + item2FinalPrice + item3FinalPrice;
    }

    static public double calcTaxes(double subtotal) {
        return subtotal * 0.055;
    }

    static public double calcTotal(double subtotal, double tax) {
        return subtotal + tax;
    }

    static public String stringConcatenation(double subtotal, double tax, double total) {
        String outputString = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f\n", subtotal, tax, total);
        return outputString;
    }
}

