package Algorithms.Interpretation.Tests;

import Algorithms.Interpretation.DijkstraCalculator;
import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by oz on 05.03.2016.
 */
public class DijkstraCalculatorTest extends TestCase {

    public void testCompute_AdditionAndSubtraction() throws Exception {
        DijkstraCalculator sut = new DijkstraCalculator();
        String input = "( ( 1 + 2 ) - 1 )";
        double  expected = 2.0;
        double actual = sut.Compute(input);

        Assert.assertEquals(expected,actual);
    }

    public void testComputeAdditionAndMultiplication() throws Exception {
        DijkstraCalculator sut = new DijkstraCalculator();
        String input = "( 5 + ( 2 * 3 ) )";
        double  expected = 11.0;
        double actual = sut.Compute(input);

        Assert.assertEquals(expected,actual);
    }

    public void testComputeSubtractionAndDivision() throws Exception {
        DijkstraCalculator sut = new DijkstraCalculator();
        String input = "( ( 11 - 2 ) / 3 )";
        double  expected = 3.0;
        double actual = sut.Compute(input);

        Assert.assertEquals(expected,actual);
    }
}