package streamapi;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class Person {

    public void printPerson() {
        System.out.println(this.toString());
    }

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public static List<Person> generateDefaultList() {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Shabbir", 20, Sex.MALE, "shabbir@gmail.com"));
        people.add(new Person("Nikhil", 21, Sex.MALE, "nikhil@gmail.com"));
        people.add(new Person("Shivam", 19, Sex.MALE, "shivam@gmail.com"));
        return  people;
    }
}