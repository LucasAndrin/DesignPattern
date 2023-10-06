package generics.exercices.exe2;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        Product<String> productA = new Product<>(uuid);
        Product<Integer> productB = new Product<>(1);

        System.out.println("productA: " + productA);
        System.out.println("productB: " + productB);
    }

}
