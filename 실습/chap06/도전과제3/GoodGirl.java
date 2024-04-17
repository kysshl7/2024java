package 도전과제3;

public class GoodGirl extends Girl {
	GoodGirl(String name) {
		super(name);
	}

    void show() {
		System.out.println(name + "는 자바를 무지하게 잘 안다.");
	}
}