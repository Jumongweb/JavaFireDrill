package checkout;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Checkout {
        private static ArrayList<String> itemBoughtList = new ArrayList<>();
        private static ArrayList<Integer> quantityList = new ArrayList<>();
        private static ArrayList<Double> itemPriceList = new ArrayList<>();
        private static ArrayList<Double> priceTotal = new ArrayList<>();
        private static String cashierName;
        private static double discount;
        private static Date date = new Date();
        private static SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yy hh.mm.ss aa");

        public static void main(String[] args){
            double itemSum = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.print("What is the customer's Name? ");
            String customerName = scanner.nextLine();
            displaySales(scanner);

            moreItem(scanner);

            System.out.println();
            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
            System.out.println("TEL: 03293828343");
            System.out.println("Date: " + formatter.format(date).toString());
            System.out.println("Cashier: " + cashierName);
            System.out.println("Customer Name: " + customerName);

            System.out.println("==================================================================");
            System.out.printf("%20s %10s %10s %10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
            System.out.println("------------------------------------------------------------------");

            for (int i = 0; i < itemBoughtList.size(); i++) {
                itemSum += priceTotal.get(i);
                System.out.printf("%20s %10d %,10.2f %,10.2f%n", itemBoughtList.get(i), quantityList.get(i), itemPriceList.get(i), priceTotal.get(i));
            }
            System.out.println("------------------------------------------------------------------");
            double vat = itemSum * (17.50 / 100);
            double itemDiscount = itemSum * (discount / 100.0);
            System.out.printf("%40s %.2f%n", "Sub Total:", itemSum);
            System.out.printf("%40s %.2f%n", "Discount: ", itemDiscount);
            System.out.printf("%40s %.2f%n", "VAT @ 17.50%: ", vat);

            double billTotal = itemSum - itemDiscount + vat;
            System.out.println("==================================================================");
            System.out.printf("%40s %.2f%n", "Bill Total:", billTotal);

            System.out.println("==================================================================");
            System.out.printf("THIS IS NOT A RECEIPT KINDLY PAY %.2f%n", billTotal);

            System.out.println("==================================================================");
            System.out.println();
            System.out.print("How much did the customer give to you? ");
            double payment = scanner.nextDouble();

            System.out.println();
            System.out.println("SEMICOLON STORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
            System.out.println("TEL: 03293828343");
            System.out.println(formatter.format(date).toString());
            System.out.println("Cashier: " + cashierName);
            System.out.println("Customer Name: " + customerName);

            System.out.println("==================================================================");
            System.out.printf("%20s %10s %10s %10s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
            System.out.println("------------------------------------------------------------------");

            for (int i = 0; i < itemBoughtList.size(); i++) {
                itemSum += priceTotal.get(i);
                System.out.printf("%20s %10d %,10.2f %,10.2f%n", itemBoughtList.get(i), quantityList.get(i), itemPriceList.get(i), priceTotal.get(i));
            }
            System.out.println("------------------------------------------------------------------");

            System.out.printf("%40s %.2f%n", "Sub Total:", itemSum);
            System.out.printf("%40s %.2f%n", "Discount: ", itemDiscount);
            System.out.printf("%40s %.2f%n", "VAT @ 17.50%: ", vat);

            System.out.println("==================================================================");
            System.out.printf("%40s %.2f%n", "Bill Total:", billTotal);
            System.out.printf("%40s %.2f%n", "Amount Paid: ", payment);
            System.out.printf("%40s %.2f%n", "Balance: ", payment - billTotal);
            System.out.println("==================================================================");
            System.out.printf("\t THANKS FOR YOUR PATRONAGE%n");

            System.out.println("==================================================================");



        }
        public static void moreItem(Scanner scanner) {
            System.out.print("Add more item? ");
            String addItem = scanner.nextLine().toLowerCase();
            while (addItem.equals("yes")) {
                displaySales(scanner);
                System.out.print("Add more item? ");
                addItem = scanner.nextLine().toLowerCase();
            }
            if (addItem.equals("no")) {
                System.out.print("What is your name? ");
                cashierName = scanner.nextLine();
                System.out.print("How much discount will he get? ");
                discount = scanner.nextDouble();
            }
        }

        public static void displaySales(Scanner scanner) {

            System.out.print("What did the user buy? ");
            String itemBought = scanner.nextLine();
            itemBoughtList.add(itemBought);

            System.out.print("How many pieces? ");
            int quantity = scanner.nextInt();
            while (quantity < 1){
                System.out.println("Enter a valid input: ");
                System.out.println("How many pieces");
                quantity = scanner.nextInt();
            }
            quantityList.add(quantity);
            scanner.nextLine();

            System.out.print("How much per unit? ");
            double itemPrice = scanner.nextDouble();
            while (itemPrice < 1){
                System.out.println("Enter a valid input: ");
                System.out.print("How much per unit? ");
                itemPrice = scanner.nextDouble();
            }
            itemPriceList.add(itemPrice);
            scanner.nextLine();
            priceTotal.add(quantity * itemPrice);
        }

}
