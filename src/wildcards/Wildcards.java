package wildcards;

import wildcards.users.Student;
import wildcards.users.Teacher;
import wildcards.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Wildcards {

    /**
     *
     * @param list of elements to check for duplicates
     * @return boolean whether there are duplicates or not
     */
    public static boolean hasDuplicates(List<?> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object o = list.get(i);
            for (int j = i + 1; j < size; j++) {
                if (o.equals(list.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     *
     * @param list of Users
     * @return List<UUID> of Uuids
     */
    public static List<UUID> reduceUsersUuid(List<? extends User> list) {
        List<UUID> uuids = new ArrayList<>();
        for (User user : list) {
            uuids.add(user.getUuid());
        }
        return uuids;
    }

    public static void pushUsers(List<? super User> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add(new Teacher());
            list.add(new Student());
//            Compilation Error:
//            list.add(new Object());
        }
    }

}
