package 문제6;

public class MaxTest {
	 public static void main(String[] args) { 
	        Max<Number> n = new Max<>(); 
	        System.out.println(n.max(10.0, 8.0)); 
	        System.out.println(n.max(5, 8.0)); 
	        Max<String> s = new Max<>(); 
	        System.out.println(s.max("Hello", "Hi")); 
	        System.out.println(s.max("Good", "moring")); 
	    } 

}
