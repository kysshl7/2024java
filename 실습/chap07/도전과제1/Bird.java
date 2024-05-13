package 도전과제1;

public class Bird implements Countable {
	String name;
	
	public Bird(String name) {
		
		this.name = name;
	}
    

	void fly() {
		
	}

	@Override
	public void count() {
		System.out.println(name + "가 2마리 있다.");
	}
}

