package Algorithms.Interpretation;

import java.awt.dnd.InvalidDnDOperationException;
import java.util.*;

/**
 * Created by oz on 04.03.2016.
 */
public class DijkstraCalculator {

    private static final HashSet<String> OperatorTokens = new HashSet<String>(Arrays.asList( new String[] {"+","-", "*", "/"}));

    public double Compute(String input)
    {
        if (input==null || input.isEmpty()) throw  new IllegalArgumentException();

        String[] tokens = input.split("\\s");

        Stack<Double> operandStack = new Stack<>();
        Stack<String> operatorStack = new Stack<>();

        for (String token :tokens                ) {
            if (isOperator(token)) operatorStack.push(token);
            else if (isOpeningBracket(token)) ;
            else if (isClosingBracket(token)) operandStack.push(applyOperator(operandStack.pop(), operandStack.pop(), operatorStack.pop()));
            else if (isNumeric(token)) operandStack.push(Double.parseDouble(token));
            else if (token.matches("\\s")) ;
            else throw new IllegalArgumentException();
        }

        return  operandStack.pop();
    }

    private boolean isNumeric(String token)
    {
        try {
            double d = Double.parseDouble(token);
            return true;
        }
        catch (NumberFormatException exception)
        {
            return  false;
        }
    }

    private double applyOperator(double last, double previous, String operator)
    {
        switch (operator)
        {
            case "+" : return previous + last;
            case "-" : return previous - last;
            case "*" : return previous * last ;
            case "/" : return previous / last;
            default: throw new IllegalStateException();
        }
    }

    private boolean isClosingBracket(String token) {
        return  ")".equals(token);
    }

    private  Boolean isOperator(String token)
    {
        return OperatorTokens.contains(token);
    }

    private  boolean isOpeningBracket(String token)
    {
        return "(".equals(token);
    }

}
