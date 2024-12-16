import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean mainLoop = true;

        while (mainLoop) {
            System.out.println("===============GPA Calculator===============");
            System.out.println("type your desired grade input or stop to end program");
            System.out.println("numerical or letter ");

            String choice = keyboard.next();
//
//        System.out.println("input number of classes");
//
//        int classes = keyboard.nextInt();

            if (choice.equals("numerical")) {
                double gpa = calculator.averageNums();

                System.out.println("Your GPA is " + gpa);

            } else if (choice.equals("letter")) {
                double gpa = calculator.averageLetters();

                System.out.println("Your GPA is " + gpa);

            } else if (choice.equals("stop")) {
                mainLoop = false;
            } else {
                System.out.println("Error, input a valid input method");

            }

        }

    }

}