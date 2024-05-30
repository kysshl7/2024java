package 도전과제1;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return name + ", " + score;
	}

	@Override
	public int compareTo(EnglishScore e) {
		return (score > e.score) ? 1 : 0;
	}
}