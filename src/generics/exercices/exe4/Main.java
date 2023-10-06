package generics.exercices.exe4;

public class Main {

    public static void main(String[] args) {
        int[] values = {1,2,2,3,4,5,6,6,6,7,8,9,10};
        KeySet<Integer> set = new KeySet<>();

        for (int value : values) {
            if (!set.add(String.valueOf(value), value)) {
                System.out.println(value + " is duplicated!");
            }
        }

        System.out.println(set);

    }

}
