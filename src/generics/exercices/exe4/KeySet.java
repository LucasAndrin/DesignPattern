package generics.exercices.exe4;

import java.util.ArrayList;
import java.util.List;

public class KeySet<V> {

    private List<KeyValue<V>> list;

    public boolean add(String key, V value) {
        if (key == null) {
            throw new IllegalArgumentException("the key attribute cannot be null");
        }

        initiate();

        for (KeyValue<V> keyValue : list) {
            if (keyValue.key.equals(key)) {
                return false;
            }
        }

        list.add(new KeyValue<>(key, value));
        return true;
    }

    public KeyValue<V> get(String key) {
        initiate();
        for (KeyValue<V> keyValue : list) {
            if (keyValue.key.equals(key)) {
                return keyValue;
            }
        }
        return null;
    }

    private void initiate() {
        if (list == null) {
            list = new ArrayList<>();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("KeySet{");
        sb.append(list);
        sb.append('}');
        return sb.toString();
    }
}
