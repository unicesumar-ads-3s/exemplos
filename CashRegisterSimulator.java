import java.util.Scanner;

/**
 * This program simulates a transaction in which a user pays for an item and
 * receives change.
 */
public class CashRegisterSimulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CashRegister register = new CashRegister();
        System.out.print("Enter price: ");
        double price = in.nextDouble();
        register.recordPurchase(price);
        System.out.print("Enter dollars: ");
        int dollars = in.nextInt();
        System.out.print("Enter quarters: ");
        int quarters = in.nextInt();
        System.out.print("Enter dimes: ");
        int dimes = in.nextInt();
        System.out.print("Enter nickels: ");
        int nickels = in.nextInt();
        System.out.print("Enter pennies: ");
        int pennies = in.nextInt();
        register.enterPayment(dollars, quarters, dimes, nickels, pennies);
        System.out.print("Your change: ");
        System.out.println(register.giveChange());
    }
}
