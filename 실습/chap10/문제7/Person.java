package 문제7;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String name;
    private int height, weight;

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    String getName() {
        return name;
    }

    int getHeight() {
        return height;
    }

    int getWeight() {
        return weight;
    }

    public static final ArrayList<Person> persons = new ArrayList<>(Arrays.asList(
            new Person("황진이", 160, 45),
            new Person("이순신", 180, 80),
            new Person("김삿갓", 175, 65),
            new Person("홍길동", 170, 68),
            new Person("배장화", 155, 48))
    );
}
