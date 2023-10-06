package fluent;

public class DatabaseConnection {
    private static DatabaseConnection connection;
    private String host;
    private int port;
    private String user;
    private String password;

    protected DatabaseConnection() {
    }

    public static DatabaseConnection getInstance() {
        if (connection == null) {
            connection = new DatabaseConnection();
        }
        return connection;
    }

    public DatabaseConnection host(String host) {
        this.host = host;
        return this;
    }

    public DatabaseConnection port(int port) {
        this.port = port;
        return this;
    }

    public DatabaseConnection user(String user) {
        this.user = user;
        return this;
    }

    public DatabaseConnection password(String password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatabaseConnection{");
        sb.append("host='").append(host).append('\'');
        sb.append(", port=").append(port);
        sb.append(", user='").append(user).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
