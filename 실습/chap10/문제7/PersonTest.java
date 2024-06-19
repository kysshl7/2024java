package 문제7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.ToIntFunction;

public class PersonTest {
    public static void main(String[] args) {
        double averageHeight = average(Person.persons, c-> c.getHeight());
        double averageWeight = average(Person.persons, c-> c.getWeight());

        System.out.println("평균 키 : " + averageHeight);
        System.out.println("평균 몸무게 : " + averageWeight);
    }

    public static double average(List<Person> personList, ToIntFunction<Person> df) {
        double sum = 0.0;
        for (Person p : personList){
            sum += df.applyAsInt(p);
        }
        return sum / personList.size();
    }
}