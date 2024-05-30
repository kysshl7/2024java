package 도전과제1;

public class EnglishScoreTestDemo {
	static EnglishScore findBest(EnglishScore[] a) {
		EnglishScore best = a[0];

		int number = 0;
		for (EnglishScore e : a) {
			number += e.compareTo(best);
			best = a[number];
		}
		return best;
	}

	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), 
				new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		
        System.out.println("영어 최고 점수 : " + findBest(ea));
	}
}