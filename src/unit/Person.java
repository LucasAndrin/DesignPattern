package unit;

public class Person {

    private int age;

    public Person(int age) {
        setAge(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public double salary(float value, float hours) {
        return value * hours;
    }
}
