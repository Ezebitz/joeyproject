import java.util.Scanner;

public class ClassAverage1 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter number from 0-100: ");
        double grade = input.nextDouble();
        double sum = grade;
        double numberOfStudent = 1;


        while (grade != -1){
            System.out.println("enter number from 0-100 or -1 to exit: ");
            grade = input.nextDouble();

            sum += grade;
            numberOfStudent++;
        }
        double sumOfGrade = sum;
        System.out.println("The sum of all students grade is: " + sumOfGrade);

        double average = sumOfGrade/numberOfStudent;

        System.out.printf("The average of student is: %.2f", average);
    }
}
