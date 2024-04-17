package 문제2;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] p = {new Person("길동이", 22), new Student("황진이", 23, 100), new ForeignStudent("AMY", 30, 200, "UㆍSㆍA")
   };
		for (Person i : p) {
			System.out.println(i.show());
		}
	}

}
