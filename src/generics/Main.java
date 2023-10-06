package generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> a = new Pair<>(1, "Apple");
        Pair<Integer, String> b = new Pair<>(2, "Pear");
        System.out.println(Util.compare(a, b));

        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Util.countGreaterThan(integers, 3));

        Double[] doubles = {1.2, 2.1, 3.1, 3.1, 5.1, 6.1, 7.1, 8.1};
        System.out.println(Util.countGreaterThan(doubles, 7.2));

        String[] strings = {"a", "ab", "abc", "abcd", "abcde", "abcdef"};
        System.out.println(Util.countGreaterThan(strings, "abaaaaaaaa"));

    }
}
