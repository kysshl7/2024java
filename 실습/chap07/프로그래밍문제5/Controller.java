package 프로그래밍문제5;

public class Controller {
	boolean power;

    public Controller(boolean power){
        this.power = power;
    }
    void show() {
        if (power==false) System.out.println(getName() + "가 꺼졌습니다.");
        else System.out.println(getName() + "가 켜졌습니다.");
    }
    abstract String getName();
}
