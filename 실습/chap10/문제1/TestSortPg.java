package 문제1;

public class TestSortPg {
    public static void main(String[] args) {
		SortGab c;
		BayolGab s = new BayolGab();
		System.out.println("===메서드 참조 방법===");
		System.out.print("정렬 전 : ");
		c = s::transchamjoGab;
		System.out.println(c.referenceGab());

		System.out.print("정렬 후 : ");
		c = s::transchamjoGab2;
		System.out.println(c.referenceGab());

		BayolGab s2 = new BayolGab();
		System.out.println("===람다식 방법===");
		System.out.print("정렬 전 : ");
		c = () -> s2.transchamjoGab();
		System.out.println(c.referenceGab());

		System.out.print("정렬 후 : ");
		c = () -> s2.transchamjoGab2();
		System.out.println(c.referenceGab());
    }
}

