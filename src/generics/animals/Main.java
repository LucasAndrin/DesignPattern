package generics.animals;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Animal[] animals = cats;

        animals[0] = new Dog();
    }
}
