package creational;

import creational.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();
        System.out.println(a);
        System.out.println(b);
    }
}