package unit.exercices.exe1;

public class ColumnGenerator {

    private ColumnGenerator(String name) {
        this.name = name;
    }

    private String name;

    private boolean autoincrement;

    private boolean notnull;

    private DataType type;

    public ColumnGenerator integer() {
        type = DataType.INT;
        return this;
    }

    public ColumnGenerator autoincrement() {
        autoincrement = true;
        return this;
    }

    public ColumnGenerator notnull() {
        notnull = true;
        return this;
    }

    public static ColumnGenerator create(String name) {
        return new ColumnGenerator(name);
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('`').append(name).append('`');
        sb.append(' ').append(type);
        if (notnull) {
            sb.append(" NOT NULL");
        }
        if (autoincrement) {
            sb.append(" AUTO_INCREMENT");
        }
        return sb.toString();
    }
}
