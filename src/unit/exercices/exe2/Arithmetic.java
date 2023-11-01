package unit.exercices.exe2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Arithmetic {

    public static void main(String[] args) {
        double[] a = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8, 8.9, 9.0, 10.1};
        System.out.println(standardDeviation(a));
    }

    public static double average(double[] values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }

        return sum / values.length;
    }

    public static double median(double[] values) {
        Arrays.sort(values);

        if (values.length % 2 == 0) {
            int middle = values.length / 2;
            return (values[middle] + values[middle - 1]) / 2;
        }

        return values[values.length / 2];
    }

    public static double mode(double[] values) {
        Map<Double, Integer> recurrences = new HashMap<>();

        for (double value : values) {
            recurrences.put(value, recurrences.getOrDefault(value, 0) + 1);
        }

        double mode = 0;
        double count = 0;

        for (Map.Entry<Double, Integer> entry : recurrences.entrySet()) {
            if (entry.getValue() > count) {
                mode = entry.getKey();
                count = entry.getValue();
            }
        }

        return mode;
    }

    public static double variance(double[] values) {
        double average = average(values);

        double sum = 0;
        for (double value : values) {
            sum += Math.pow(value - average, 2);
        }

        return sum / values.length;
    }

    public static double standardDeviation(double[] values) {
        return Math.sqrt(variance(values));
    }

}
