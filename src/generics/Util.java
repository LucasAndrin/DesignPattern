package generics;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static <K,V> boolean compare(Pair<K,V> a, Pair<K,V> b) {
        return a.getKey().equals(b.getKey()) && b.getValue().equals(a.getValue());
    }

    public static <T extends Comparable<T>> int countGreaterThan(T[] array, T value) {
        int count = 0;
        for (T interated : array) {
            if (interated.compareTo(value) > 0) {
                count++;
            }
        }
        return count;
    }
}
