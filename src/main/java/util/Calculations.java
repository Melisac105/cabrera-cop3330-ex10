package util;

public class Calculations {

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
}

