import java.util.Scanner;
public class Main
    {
    public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);  // create a Scanner in to read from the console

            double itemPrice = 0;
            String trash = ""; // use for bad input which will read as a String
            System.out.print("Enter your item price: ");

            if(in.hasNextDouble())
            {
                // OK safe to read in a double
                itemPrice = in.nextDouble();
                in.nextLine(); // clear the buffer
                System.out.println("You said your item price was: " + itemPrice + "$");
            }
            double shippingCost;
            if (itemPrice >= 100)
            {
                shippingCost = 0;
                // Shipping is free for items $100 or more
            }
            else
            {
                shippingCost = 0.02 * itemPrice;
                // Shipping cost is 2% of the item price
            }

            // Calculate the total price
            double totalPrice = itemPrice + shippingCost;

            // Display the shipping cost and total price
            System.out.println("Shipping cost: $" + shippingCost);
            System.out.println("Total price: $" + totalPrice);

        }
    }
