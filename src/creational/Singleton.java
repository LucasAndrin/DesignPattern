package creational;

public class Singleton {
    public static Singleton instance;
    private Singleton() {

    }
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
