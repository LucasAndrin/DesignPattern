package wildcards;

import wildcards.users.Student;
import wildcards.users.Teacher;
import wildcards.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Double> doubles = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));

        Teacher curvello = new Teacher("Curvêllo", 10.000);
        Student lucas = new Student("Lucas", 1234);

        /*
         * Unbounded Wildcards Example
         */
        List<User> list = new ArrayList<>(Arrays.asList(curvello, lucas));
        System.out.println("Has Duplicates? " + Wildcards.hasDuplicates(list));
        list.add(curvello);
        System.out.println("Has Duplicates? " + Wildcards.hasDuplicates(list));
        list.remove(2);
        Wildcards.soutListElements(list);

        /*
         * Upper Bounded Wildcards Examples
         */
        System.out.println(Wildcards.reduceUsersUuid(list));
        System.out.println(Wildcards.getAverage(integers));
        System.out.println(Wildcards.getAverage(doubles));

        /*
         * Lower Bounded Wildcards Example
         */
        Wildcards.pushUsers(list, 10);
        System.out.println(list);
        Wildcards.addInteger(integers, 1);
        System.out.println(integers);
    }
}
