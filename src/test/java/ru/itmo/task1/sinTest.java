package ru.itmo.task1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class sinTest {
    static double error = 0.1;
    static TestSin sin;

    @BeforeAll
    static void setSin()
    {
        sin = new TestSin();
    }

    void test(double x)
    {
        assertEquals(sin.count(x), Math.sin(x), error);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0, Math.PI, -Math.PI, 2 * Math.PI, -2 * Math.PI, (1/2) * Math.PI, -(1/2) * Math.PI, (3/2) * Math.PI, -(3/2) * Math.PI})
    void borderTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.1, 0.5, 0.7, 1, 1.5, 7})
    void firstQuarterTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {2, 2.5, 3.9, 3.1})
    void secondQuarterTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {3.2, 3.5, 4, 4.5})
    void thirdQuarterTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {5, 5.5, 6, 6.2})
    void fourthQuarterTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-0.5, -1, -1.5, -2, -4, -5, -6})
    void minusTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {10, 50, 500})
    void bigTests(double x)
    {
        test(x);
    }

    @ParameterizedTest
    @ValueSource(doubles = {-10, -50, -500})
    void bigNegTests(double x)
    {
        test(x);
    }
}
