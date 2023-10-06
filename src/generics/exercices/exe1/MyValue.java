package generics.exercices.exe1;

public class MyValue<V> {

    private V value;

    public MyValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyValue{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
