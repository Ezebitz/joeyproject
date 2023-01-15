package tdd;

import java.util.Scanner;

public class ClassAverage2 {
    public static void main(String[] args) {
        int numberOfStudents = 1;
        int grade = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter number from 0-100");
        grade = input.nextInt();
        int sum = +grade;
        while (grade != -1) ;
        System.out.println("enter the next grade or -1 to exit");


        grade = input.nextInt();
        int sumOfgrade;
        numberOfStudents++;
        sum += grade;



        sumOfgrade=sum;
        System.out.printf("the grade is %d%n", grade);

        int average = sumOfgrade / numberOfStudents;
        System.out.println("the  average of the grades");



    }
}