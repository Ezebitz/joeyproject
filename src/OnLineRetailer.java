import java.util.Scanner;

public class OnLineRetailer {
    private static int product;
    private static int quantity;
    private static int amount;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double product1 = 2.98;
        int product1QuantitySold=1;
        double product2 = 4.50;
        int product2QuantitySold=1;
        double product3 = 9.98;
        int product3QuantitySold=1;
        double product4 = 4.49;
        int product4QuantitySold=1;
        double product5 = 6.8;
        int product5Quantity=1;
        String productName = "";
        double result = 0;
        System.out.print("enter productName or type exit to exit");
        String productNumber = input.nextLine();

        while (!productName.equalsIgnoreCase("exit")) {
            switch (productName) {


                case "product1" -> {
                    System.out.print("enter the quantity sold:");
                    product1QuantitySold = input.nextInt();
                    result += product1 * product1QuantitySold;
                    System.out.printf("the quantity ");
                }
                case "product2" -> {
                    System.out.print("enter the quantity sold");
                    product2QuantitySold = input.nextInt();
                    result += product1 * product1QuantitySold;
                    System.out.printf("the quantity sold");
                }
                case "product3" -> {
                    System.out.printf("enter the quantity sold:");
                    product3QuantitySold = input.nextInt();
                    result += product3 * product3QuantitySold;
                    System.out.printf("the quantity %d%n",product3);
                }
                case "product4" -> {
                    System.out.println("enter the quantity sold:");
                    product4QuantitySold = input.nextInt();
                    result += product4 * product4QuantitySold;
                    System.out.printf("");
                }
                case "product5" -> {
                    System.out.println("enter quantity sold:");
                    int product5QuantitySold = input.nextInt();
                    result += product5 * product5QuantitySold;
                    System.out.printf("%n the price of the quantity 20.2%");

                }
                case"default"


                }


        }
    }
}