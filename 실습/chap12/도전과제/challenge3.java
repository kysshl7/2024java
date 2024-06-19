package 도전과제;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class challenge3 {

public static void main(String[] args) {
// TODO Auto-generated method stub
List<String> names = List.of("홍길동", "배장화", "임꺽정", "연흥부", "김선달", "황진이");
List<Integer> ages = List.of(25, 20, 29, 28, 32, 18);
List<Gender> genders = List. of (Gender.남, Gender.여, Gender.남, Gender.남, Gender.남, Gender.여);
Stream s = names.stream();
s.filter(x -> ((String) x).charAt(0) < '이').forEach(x -> System.out.print(x + " "));
System.out.println();
s = names.stream();
s.sorted().forEach(x -> System.out.print(x + " "));
System.out.println();
s = names.stream();
System.out.println(s.findFirst());
s = names.stream();
System.out.println(s.findFirst().get());
s = names.stream();
System.out.println(s.count());
Stream<Integer> i = ages.stream();
int sum = i.reduce(0, (a, b) -> a + b);
System.out.println(sum);
i = ages.stream();
int max = i.max((a, b) -> a - b).get();
System.out.println(max);
i=ages.stream();
System.out.println(i.mapToInt(a -> a.intValue()). average().getAsDouble());
s = names.stream();
Stream<Member> m = s.map(x -> new Member(x, genders.get(j), ages.get(j++)));
m.forEach(y -> System.out.print(y +" "));
System.out.println();
j = 0;
s = names.stream();
m = s.map(x -> new Member(x, genders.get(j), ages.get(j++)));
Map<Gender, List<Member>> map = m.collect (Collectors.groupingBy (Member:: getGender));
System.out.println(map);
	}
}


enum Gender {
남, 여
};

class Member {
String name;
Gender gender;
int age;

Member(String x, Gender gender, int age) {
this.name = x;
this.gender = gender;
this.age = age;
}
String getName() {
return name;
}
Gender getGender() {
return gender;
}
int getAge() {
return age;
}
public String toString() {
return String.format("Member (%s, %s, %d)", name, gender, age);
		}
}
