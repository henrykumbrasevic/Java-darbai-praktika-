package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {
        return (int) users.stream().filter(user -> user.getAge() > 25).count();
    }

    public static double getAverageAge(List<User> users) {
        double average = 0;
        for (User user : users){
            average += user.getAge();
        }
        return average / users.size();
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().getAsInt();
    }

    public static User findByName(List<User> users, String name) {
        return users.stream().filter(user -> user.getName().equals(name)).findAny().get();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).toList();
    }

    public static User findOldest(List<User> users) {
        return users.stream().max(Comparator.comparing(User::getAge)).get();
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

}
