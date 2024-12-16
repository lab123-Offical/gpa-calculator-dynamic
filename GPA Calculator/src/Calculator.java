import java.util.HashMap;
import java.util.Scanner;

public class Calculator
{

    HashMap<String, Integer> letterGrade = new HashMap<String, Integer>();
    Scanner keyboard = new Scanner(System.in);

    public Calculator()
    {
        letterGrade.put("a", 4);
        letterGrade.put("b", 3);
        letterGrade.put("c", 2);
        letterGrade.put("d", 1);
        letterGrade.put("f", 0);
    }

    public double averageNums()
    {
        System.out.println("===============numerical input===============");
        System.out.println("4 = a");
        System.out.println("3 = b");
        System.out.println("2 = c");
        System.out.println("1 = d");
        System.out.println("0 = f");
        System.out.println("enter your grades separated by commas and no spaces");

        String input = keyboard.next();

        String[] grades = input.split(",");

//            int sum = 0;
//            for(String grade : grades) {
//                sum += Integer.parseInt(grade);
//            }

        double sum = 0;

        for (int i = 0; i < grades.length; i++)
        {
            sum += Integer.parseInt(grades[i]);
        }

        double gpa = sum / grades.length;

        return gpa;
    }

    public double averageLetters()
    {
        System.out.println("===============numerical input===============");
        System.out.println("enter your grades separated by commas and no spaces");

        String input = keyboard.next();

        String[] grades = input.split(",");

//            int sum = 0;
//            for(String grade : grades) {
//                sum += Integer.parseInt(grade);
//            }

        double sum = 0;

        for (int i = 0; i < grades.length; i++)
        {
            sum += Integer.parseInt(String.valueOf(letterGrade.get(grades[i])));
        }

        double gpa = sum / grades.length;

        return gpa;
    }

}
