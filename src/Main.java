import java.util.Scanner;
public class Main // class Main
    {
    public static void main(String[] args) // main()
        {
            Scanner in = new Scanner(System.in);  // create a Scanner in to read from the console
            double shippingCost; // num shippingCost = 0
            double itemPrice = 0; // num itemPrice = 0
            String trash = ""; // use for bad input which will read as a String
            System.out.print("Enter your item price: "); // output "Enter the price of an item:"

            if(in.hasNextDouble())
            {
                // OK safe to read in a double
                itemPrice = in.nextDouble(); // input itemPrice
                in.nextLine();
                System.out.println("You said your item price was: " + itemPrice + "$");

                if (itemPrice >= 100) // if itemPrice >= 100
                {
                    shippingCost = 0; // then shippingCost = 0
                    // Shipping is free for items $100 or more
                }
                else
                {
                    shippingCost = 0.02 * itemPrice; // shippingCost = itemPrice * 0.02
                    // Shipping cost is 2% of the item price
                } //end if

                double totalPrice = itemPrice + shippingCost; // totalPrice =  itemPrice + shippingCost

                // Display the shipping cost and total price
                System.out.println("Shipping cost: $" + shippingCost); // output "The shipping cost: " + shippingCost
                System.out.println("Total price: $" + totalPrice); // output "The total price is: " + totalPrice

            }
            else
            {
                // Not a double can’t use nextDouble() read as String with nextLine() instead
                trash = in.nextLine();  // Ok have to read the input as a String
                System.out.println("You said your item price was: " + trash);
                System.out.println("Run the program again and enter a valid amount!");
            } // end if


        } // return
    } // end class
