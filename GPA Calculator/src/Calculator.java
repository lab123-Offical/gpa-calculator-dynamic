import java.util.HashMap;

public class Calculator
{

    HashMap<String, Integer> letterGrade = new HashMap<String, Integer>();

    public Calculator()
    {
        letterGrade.put("a", 4);
        letterGrade.put("b", 3);
        letterGrade.put("c", 2);
        letterGrade.put("d", 1);
        letterGrade.put("f", 0);
    }

    public double AverageNums(
            int first,
            int second,
            int third,
            int fourth,
            int fifth,
            int sixth,
            int seventh)
    {
        double gpa = (first + second + third + fourth + fifth + sixth + seventh) / 7.0;

        return gpa;
    }

    public double AverageLetters(
            String first,
            String second,
            String third,
            String fourth,
            String fifth,
            String sixth,
            String seventh)
    {
        int firstNum = letterGrade.get("first");
        int secondNum = letterGrade.get("second");
        int thirdNum = letterGrade.get("third");
        int fourthNum = letterGrade.get("fourth");
        int fifthNum = letterGrade.get("fifth");
        int sixthNum = letterGrade.get("sixth");
        int seventhNum = letterGrade.get("seventh");

        double gpa = (firstNum + secondNum + thirdNum + fourthNum + fifthNum + sixthNum + seventhNum) / 7.0;

        return gpa;
    }

}
