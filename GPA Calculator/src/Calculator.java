import java.util.HashMap;
import java.util.Scanner;

public class Calculator
{

    HashMap<String, Integer> letterGrade = new HashMap<String, Integer>();
    Scanner keyboard = new Scanner(System.in);

    public Calculator() {
        letterGrade.put("a", 4);
        letterGrade.put("b", 3);
        letterGrade.put("c", 2);
        letterGrade.put("d", 1);
        letterGrade.put("f", 0);
    }

    public double averageNums(String input) {
        String[] grades = input.split(",");

        double sum = 0;

        for (String grade : grades) {
            sum += Integer.parseInt(grade);
        }

        double gpa = sum / grades.length;

        return gpa;
    }

    public double averageLetters(String input) {
        String[] grades = input.split(",");

        double sum = 0;

        for (String grade : grades) {
            sum += Integer.parseInt(String.valueOf(letterGrade.get(grade)));
        }

        double gpa = sum / grades.length;

        return gpa;
    }

}
