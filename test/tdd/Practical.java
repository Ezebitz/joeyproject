package test.tdd;

import java.util.Scanner;

public class Practical {
    int userInput;


    public void daysOfWeek() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        userInput = scanner.nextInt();
        //prompt user to enter a number

        if (userInput == 1) {
            System.out.println("today is sunday");
        } else if (userInput == 2) {
            System.out.println("today is monday");
        } else if (userInput == 3) {
            System.out.println("today is wednesday");
        } else if (userInput == 4) {
        } else if (userInput == 5) {
            System.out.println("today is thursday");
        } else if (userInput == 6) {
            System.out.println("today is friday");
        } else if (userInput == 7) {
            System.out.println("u don't know");


        }
    }

    public void result() {


        Scanner joe = new Scanner(System.in);
        userInput=1;
        while (userInput<=7)
            userInput++;


        System.out.println("enter a number");
        int userInput = joe.nextInt();
        switch (userInput) {
            case 1:
                System.out.println("Today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
            System.out.println("today is thursday");
            break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println("get away");


        }
    }
}