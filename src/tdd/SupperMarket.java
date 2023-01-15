
package src.tdd;

import java.util.Scanner;

public class SupperMarket {
    private static int shoePrice = 250;
    private static int bagPrice = 300;
    private static int bookPrice = 150;
    private static int totalPrice;

    static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(){
        System.out.println( """
                to check book price press 1
                to check bags price press 2
                to check shoes price press 3
                """);
        int input = scanner.nextInt();
        switch (input){
            case 1:userChoice1();
            break;
            case 2: userChoice2();
            break;
            case 3: userChoice3();
            break;
            default:
                System.out.println("Invalid!!!");
                System.out.println("");
                displayMenu();
        }
    }

    public static void userChoice1(){
        System.out.println("How many books do you want\n");
        System.out.printf("a book is #%d%n",bookPrice);

        buyOrGoBack("Book");

    }
    public static void userChoice2(){
        System.out.println("How many bags do you want\n");
        System.out.printf("a bag is %d%n",bagPrice);

        buyOrGoBack("Bag");
    }
    public static void userChoice3(){
        System.out.println("How many shoes do you want");
        System.out.printf("a shoe is %d%n",shoePrice);

        buyOrGoBack("Shoe");
    }

    public static void buyOrGoBack(String item){
        System.out.println("""
                1. Buy
                2. Go back
                """);
        int userInput = scanner.nextInt();
        switch (userInput){
            case 1:
                System.out.print("Quantity: ");
                int quantity = scanner.nextInt();
                calculateTotalPrice(quantity,item);
                System.out.printf("%s bought total, price is %d %n",item,totalPrice);
                break;
            case 2: displayMenu();
        }
    }

    public static void calculateTotalPrice(int quantity, String item){
        int itemPrice = 0;
        if(item.equals("Book")) itemPrice = bookPrice;
        if(item.equals("Bag")) itemPrice = bagPrice;
        if(item.equals("Shoe")) itemPrice = shoePrice;
        totalPrice = quantity*itemPrice;
    }

//    public int calculateBookQuantity(int bookQuantity){
//                return total = 0;
//
//    }


}
