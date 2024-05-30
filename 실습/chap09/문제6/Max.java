package 문제6;

public class Max <Object> { 
    String s1, s2; 
    double n1, n2; 
    public Object max (Object ns1, Object ns2) { 
        if (ns1 instanceof Number) { 
            n1 = ((Number) ns1).doubleValue(); 
            n2 = ((Number) ns2).doubleValue(); 
            return (n1>n2) ? ns1 : ns2; 
        } 
        else { 
            s1 = (String) ns1; 
            s2 = (String) ns2; 
            return (s1.length()>s2.length()) ? ns1 : ns2; 
        } 
    } 
}
