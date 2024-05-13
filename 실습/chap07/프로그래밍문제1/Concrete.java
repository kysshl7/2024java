package 프로그래밍문제1;

public class Concrete extends Abstract {
	int j;

	Concrete(int i, int j) {
		this.i = i;
		this.j = j;
	}

	@Override
	void show() {
		System.out.printf("i = %d, j = %d", i, j);
	}
}