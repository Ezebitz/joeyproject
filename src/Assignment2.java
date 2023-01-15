import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int gradeCounter = 1;

        System.out.println("enter result");
        int grade = input.nextInt();
        while (gradeCounter <= 10) {

            //gradeCounter = gradeCounter +1;
            System.out.print("enter another grade");

            //total = total+ grade;
            int average = total / 10;

            gradeCounter = gradeCounter + 1;

            System.out.printf("class average is %d%n", total,average);
        }




    }
}
