package 프로그래밍문제6;

public class Complex {
	double a, b;
	
	Complex(double a){
		this.a=a;
	}
	
	Complex(double a, double b){
		this.a = a;
		this.b = b;
	}
	
	void print() {
		System.out.printf("%.1f + %.1fi\n", a, b);
	}

}
