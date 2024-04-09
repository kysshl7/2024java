package 프로그래밍문제;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumExceptFirst(1, 2, 3, 4));
		int arr[] = {2, 3};
		System.out.println(sumExceptFirst(1, arr));
		System.out.println(sumExceptFirst(1, 2, 3, 4, 5));

	}
	
	private static int sumExceptFirst(int a, int...v) {
		int sum = 0;
		
		for(int i : v) {
			sum += i;
		}
		return sum;
	}

}
