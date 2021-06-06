import util.Processing;
import util.Output;
import util.UsrInput;

/*
UCF COP3330 Summer 2021 Assignment 1 Solution
Copyright 2021 first_name last_name

Exercise 10 - Self-Checkout
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output

Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52

Constraints

Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */
public class SelfCheckOutApp {

    public static void main(String[] args) {
        String item1PriceStr = UsrInput.getPrice(1);
        String item1QuantityStr = UsrInput.getQuantity(1);
        String item2PriceStr = UsrInput.getPrice(2);
        String item2QuantityStr = UsrInput.getQuantity(2);
        String item3PriceStr = UsrInput.getPrice(3);
        String item3QuantityStr = UsrInput.getQuantity(3);

        double item1Price = Processing.convertStringToIntPrice(item1PriceStr);
        double item2Price = Processing.convertStringToIntPrice(item2PriceStr);
        double item3Price = Processing.convertStringToIntPrice(item3PriceStr);
        int item1Quantity = Processing.convertStringToIntQuantity(item1QuantityStr);
        int item2Quantity = Processing.convertStringToIntQuantity(item2QuantityStr);
        int item3Quantity = Processing.convertStringToIntQuantity(item3QuantityStr);

        double subtotal = Processing.calcSubtotal(item1Price, item1Quantity, item2Price, item2Quantity, item3Price, item3Quantity);
        double taxes = Processing.calcTaxes(subtotal);
        double total = Processing.calcTotal(subtotal, taxes);
        String output = Processing.stringConcatenation(subtotal, taxes, total);
        Output.printOutput(output);
    }

}
