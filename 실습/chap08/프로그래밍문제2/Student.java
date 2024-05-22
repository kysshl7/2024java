package 프로그래밍문제2;

import java.text.MessageFormat;

public class Student {
	String name;

	public Student(String name) {
		this.name = name;
	}

	public String toString() {
		String s = MessageFormat.format("학생[{0}]", name);
		return s;
	}
}
