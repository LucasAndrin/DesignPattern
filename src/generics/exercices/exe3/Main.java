package generics.exercices.exe3;

import generics.exercices.exe2.Product;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        Product<String> productA = new Product<>(uuid);
        Product<Integer> productB = new Product<>(1);

        ProductRequest productRequest = new ProductRequest();
        productRequest.addProduct(productA);
        productRequest.addProduct(productB);

        System.out.println("Products: " + productRequest.getProducts());
    }

}
