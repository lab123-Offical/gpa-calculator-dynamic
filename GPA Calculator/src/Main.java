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
                System.out.println("===============numerical input===============");
                System.out.println("4 = a");
                System.out.println("3 = b");
                System.out.println("2 = c");
                System.out.println("1 = d");
                System.out.println("0 = f");
                System.out.println("enter your grades separated by commas and no spaces");

                String input = keyboard.next();

                double gpa = calculator.averageNums(input);

                System.out.println("Your GPA is " + gpa);

            } else if (choice.equals("letter")) {
                System.out.println("===============numerical input===============");
                System.out.println("enter your grades separated by commas and no spaces");

                String input = keyboard.next();

                double gpa = calculator.averageLetters(input);

                System.out.println("Your GPA is " + gpa);

            } else if (choice.equals("stop")) {
                mainLoop = false;

            } else {
                System.out.println("Error, input a valid input method");

            }

        }

    }

}