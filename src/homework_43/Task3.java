package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<Person> people = generatePeople();
        System.out.println(people.stream().filter(person -> person.getAge()>25&& person.getCity()=="Berlin").collect(Collectors.toSet()));

    }

    private static List<Person> generatePeople() {
        return List.of(
                new Person("Ivan20f", 20, "Frankfurt"),
                new Person("Ivan27f", 27, "Frankfurt"),
                new Person("Ivan30b", 30, "Berlin"),
                new Person("Angelika", 22, "Heidelberg"),
                new Person("Floppa", 40, "Berlin")
        );
    }
}
