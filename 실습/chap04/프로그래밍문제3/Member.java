package 프로그래밍문제3;

public class Member {
	private String Name, Id, Password;
	private int age;
	
	String getName() {
		return Name;
	}
	
	String getId() {
		return Id;
	}
	
	String getPassword() {
		return Password;
	}
	
	int getage() {
		return age;
	}
	
	void setMember(String Name, String Id, String Password, int age) {
		this.Name = Name;
		this.Id = Id;
		this.Password = Password;
		this.age = age;
	}
	public Member(String Name, String Id, String Password, int age) {
		this.Name = Name;
		this.Id = Id;
		this.Password = Password;
		this.age = age;
	}
	
}
