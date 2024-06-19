package 문제1;

import java.util.Arrays;

public class BayolGab {
	String[] strBayol2 = { "K", "o", "r", "e", "a", "n" };

	String transchamjoGab() {
		return toString();
	}

	String transchamjoGab2() {
		Arrays.sort(strBayol2, String.CASE_INSENSITIVE_ORDER);
		return toString();
	}
    
	public String toString() {
		return Arrays.toString(strBayol2).replaceAll("\\[", "").replaceAll("\\]", "").replaceAll(",", "");
	}
}

public interface SortGab {
    String referenceGab();
}
