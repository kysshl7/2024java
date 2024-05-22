package 프로그래밍문제1;

import java.util.Objects;

public class Circle {
	int num;
	
	public Circle(int num) {
		this.num=num;
	}
	
	public int hashCode() {
		return Objects.hash(num);
	}
	
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Circle))
			return false;
		
		Circle confignation=(Circle)obj;
		return num == confignation.num;
	}
}
