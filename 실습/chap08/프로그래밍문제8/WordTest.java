package 프로그래밍문제8;

import java.util.Arrays;
import java.util.StringTokenizer;

public class WordTest {
	public static void main(String[] args) {
		String s = "Empty vessels make the most sound.";
		StringTokenizer st = new StringTokenizer(s);
		
		System.out.println(s);
		System.out.println("단어 개수 : " + st.countTokens());
		
		String[] s2 = new String[st.countTokens()];
		System.out.print("정렬된 토큰 : ");
		for (int i = 0; i < s2.length; i++) {
			s2[i] = st.nextToken();
		}
		Arrays.sort(s2);
		int number = 0;
		while (number < s2.length) {
			System.out.print(s2[number] + ", ");
			number++;
		}
	}

}
