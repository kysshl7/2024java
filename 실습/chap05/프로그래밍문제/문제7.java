package 프로그래밍문제;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3, 2, 4, 1, 5};
		int b[] = {3, 2, 4, 1};
		int c[] = {3, 2, 4, 1, 5};
		int d[] = {2, 7, 1, 8, 2};
		
		equal(a, b);
		equal(a, c);
		equal(a, d);
		equal(b, c);
		equal(b, d);
		equal(c, d);

	}
	
	private static void equal(int[] a, int[] b) {
		int count = 0;
		if(a.length == b.length) {
			for(int i=0; i<a.length; i++) {
				if(a[i] == b[i]) {
					count++;
				}
			}
		}
		if(count==a.length) {
			System.out.println("같습니다.");
		}
		else 
			System.out.println("다릅니다.");
	}

}
