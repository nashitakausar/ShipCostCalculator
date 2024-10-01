import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double itemPrice = 0;
        double shipCost = 0;
        double totalPrice = 0;

        System.out.print("Please enter the item's price: ");

        if (in.hasNextDouble())
        {
            itemPrice = in.nextDouble();

            if (itemPrice >= 100)
            {
                shipCost = 0;
                totalPrice = itemPrice;
            } else {
                shipCost = 0.02 * itemPrice;
                totalPrice = itemPrice + shipCost;
            }

            System.out.println("Shipping cost: $" + shipCost);
            System.out.println("Total price: $" + totalPrice);
        } else

        {

            System.out.println("Invalid input! Please enter a valid number.");
        }
        in.close();
    }
}
