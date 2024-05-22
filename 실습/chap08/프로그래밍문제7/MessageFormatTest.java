package 프로그래밍문제7;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		Object[] data2 = { "이름 : ", "\t번호 : ", "\t\t국적 : " };
		String s = "";
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				s = MessageFormat.format("{0}{1}", data2[j], data[i][j]);
				System.out.print(s);
			}
			System.out.println();

	}
		
	}

}
