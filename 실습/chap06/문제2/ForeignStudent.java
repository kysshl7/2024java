package 문제2;

public class ForeignStudent extends Student {
	String nation;
	
	public ForeignStudent(String name, int age, int number, String nation) {
		super(name, age, number);
		this.nation = nation;
	}
	
	String getForeignStudentNaion() {
		return nation;
	}
	
	String show() {
		return"외국학생[이름 : "+name+", 나이 : "+age+", "+"학번 : "+number+", "+"국적 : "+nation+"]";
	}

}
