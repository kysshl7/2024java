package 문제4;

public class Pair <Number>{ 
    Number x, y; 
    public Pair (Number x, Number y) { 
        this.x = x; 
        this.y = y; 
    } 
    public Number first() { 
        return x; 
    } 
    public Number second() { 
        return y; 
    } 
}