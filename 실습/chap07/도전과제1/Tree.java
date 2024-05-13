package 도전과제1;

class Tree implements Countable {

	String name;

	public Tree(String name) {
	
		this.name = name;
	}

	void fly() {

	}

	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다.");
	}
}
