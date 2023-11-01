package unit.exercices.exe2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    double[] a = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0, 10.1};

    double[] b = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.0, 11.0};

    double[] c = {1.1, 2.2, 3.3, 1.1, 2.2, 1.1, 7.7, 8.8, 9.9, 10.0, 11.0};

    double precision = 0.000001;

    @Test
    void average() {
        assertEquals(5.95, Arithmetic.average(a));
    }

    @Test
    void median() {
        assertEquals(6.15, Arithmetic.median(a));
        assertEquals(6.6, Arithmetic.median(b));
    }

    @Test
    void mode() {
        assertEquals(1.1, Arithmetic.mode(c));
    }

    @Test
    void variance() {
        assertEquals(8.3825, Arithmetic.variance(a));
        assertEquals(10.364463, Arithmetic.variance(b), precision);
        assertEquals(15.444463, Arithmetic.variance(c), precision);
    }

    void standardDeviation() {
        assertEquals(2.8952547383606855, Arithmetic.standardDeviation(a));
    }
}