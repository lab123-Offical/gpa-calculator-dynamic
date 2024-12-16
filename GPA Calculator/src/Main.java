import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("===============GPA Calculator===============");
        System.out.println("type your desired grade input");
        System.out.println("numerical or letter");

        String choice = keyboard.next();

        if (choice.equals("numerical"))
        {
            System.out.println("===============numerical input===============");
            System.out.println("4 = a");
            System.out.println("3 = b");
            System.out.println("2 = c");
            System.out.println("1 = d");
            System.out.println("0 = f");
            System.out.println("enter 7 grades separated by commas and no spaces");

            String input = keyboard.next();

            String[] grades = input.split(",");
            String first = grades[0];
            String second = grades[1];
            String third = grades[2];
            String fourth = grades[3];
            String fifth = grades[4];
            String sixth = grades[5];
            String seventh = grades[6];

            int firstInt = Integer.parseInt(first);
            int secondInt = Integer.parseInt(second);
            int thirdInt = Integer.parseInt(third);
            int fourthInt = Integer.parseInt(fourth);
            int fifthInt = Integer.parseInt(fifth);
            int sixthInt = Integer.parseInt(sixth);
            int seventhInt = Integer.parseInt(seventh);

            double gpa = calculator.AverageNums(firstInt, secondInt, thirdInt, fourthInt, fifthInt, sixthInt, seventhInt);

            System.out.println("Your GPA is " + gpa);

        }
        else if (choice.equals("letter"))
        {
            System.out.println("===============letter input===============");
            System.out.println("enter 7 letter grades separated by commas and no spaces");

            String input = keyboard.next();

            String[] grades = input.split(",");
            String first = grades[0];
            String second = grades[1];
            String third = grades[2];
            String fourth = grades[3];
            String fifth = grades[4];
            String sixth = grades[5];
            String seventh = grades[6];

            double gpa = calculator.AverageLetters(first, second, third, fourth, fifth, sixth, seventh);

            System.out.println("Your GPA is " + gpa);

        }

    }

}