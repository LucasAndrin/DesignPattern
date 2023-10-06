package generics.exercices.exe1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<MyValue<?>> values = new ArrayList<>(Arrays.asList(
                new MyValue<>("Hello World!"),
                new MyValue<>(10),
                new MyValue<>(10.1f),
                new MyValue<>(10.1)
        ));

        System.out.println(values);

    }

}
