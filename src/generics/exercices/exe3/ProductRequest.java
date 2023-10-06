package generics.exercices.exe3;

import generics.exercices.exe2.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRequest {

    private List<Product<?>> products;

    public ProductRequest() {

    }

    public ProductRequest(Product<?> product) {
        addProduct(product);
    }

    public ProductRequest(List<Product<?>> products) {
        this.products = products;
    }

    public List<Product<?>> getProducts() {
        return products;
    }

    public void addProduct(Product<?> product) {
        if (products == null) {
            products = new ArrayList<>();
        }
        products.add(product);
    }

    public void setProducts(List<Product<?>> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductRequest{");
        sb.append("products=").append(products);
        sb.append('}');
        return sb.toString();
    }
}
