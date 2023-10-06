package generics.exercices.exe2;

import java.time.LocalDateTime;

public class Product<K> {

    private K id;

    private float value;

    private LocalDateTime manufactureDate, dueDate;

    public Product(K id) {
        setId(id);
    }

    public K getId() {
        return id;
    }

    public void setId(K id) {
        if (id instanceof String || id instanceof Integer) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("Invalid type for id attribute");
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Product{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append(", manufactureDate=").append(manufactureDate);
        sb.append(", dueDate=").append(dueDate);
        sb.append('}');
        return sb.toString();
    }
}
