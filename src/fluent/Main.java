package fluent;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection connection = DatabaseConnection.getInstance();
        connection.host("localhost")
                .port(8080)
                .user("postgres")
                .password("postgres");

        System.out.println(connection);
    }
}
