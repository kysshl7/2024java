package 프로그래밍문제1;

public class AbstractTest {
	public static void main(String[] args) {
        Concrete c = new Concrete(100, 50);
        c.show();
    }
}

abstract class Abstract {
	int i;

	abstract void show();
}

