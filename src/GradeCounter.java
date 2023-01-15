import java.util.Scanner;

public class GradeCounter {
    public static void main(String[] args) {
        int total = 0;
        int gradeCounter = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("enter the first grade or -1 to  quit ");

        int grade = input.nextInt();
        while (grade != -1) {
            total = total + grade;
            gradeCounter = gradeCounter + 1;
            System.out.println("enter the next grade or -1 to quit ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0) {
            int average = total / gradeCounter;
            System.out.printf("Total of the grades entered is %d%n",  total);
            System.out.printf("Average of the grades entered is %d", average);
        }
        else {
            System.out.println("No grades were entered");

        }
    }
}

