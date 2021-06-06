import util.Calculations;
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
        double item1Price = UsrInput.getPrice(1);
        int item1Quantity = UsrInput.getQuantity(1);
        double item2Price = UsrInput.getPrice(2);
        int item2Quantity = UsrInput.getQuantity(2);
        double item3Price = UsrInput.getPrice(3);
        int item3Quantity = UsrInput.getQuantity(3);

        double subtotal = Calculations.calcSubtotal(item1Price, item1Quantity, item2Price, item2Quantity, item3Price, item3Quantity);
        double taxes = Calculations.calcTaxes(subtotal);
        double total = Calculations.calcTotal(subtotal, taxes);
        Output.printOutput(subtotal, taxes, total);
    }

}
