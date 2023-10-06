package wildcards;

import wildcards.users.Student;
import wildcards.users.Teacher;
import wildcards.users.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

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

        /*
         * Upper Bounded Wildcards Example
         */
        System.out.println(Wildcards.reduceUsersUuid(list));

        /*
         * Lower Bounded Wildcards Example
         */
        Wildcards.pushUsers(list, 10);
        System.out.println(list);
    }
}
