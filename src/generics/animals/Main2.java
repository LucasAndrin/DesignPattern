package generics.animals;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        System.out.println(dogs);
        List<? extends Animal> animals = dogs;
        System.out.println(animals);
    }
}
