package 문제3;

import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerTest {
	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		Consumer<Integer> cns = x -> {
			if (x >= 2) {
				System.out.print(x + " apples.");
			} else {
				System.out.print(x + " apple.");
			}
			System.out.println();
		};

		for (int i = 0; i < 2; i++) {
			int intGab = inScanner.nextInt();
			cns.accept(intGab);
		}
		Consumer<Integer> cns2 = x -> {
			if (x >= 2) {
				System.out.print(x + " apples.");
			} else {
				System.out.print(x + " apple.");
			}
			System.out.println();
		};

		for (int i = 0; i < 2; i++) {
			cns2.accept(ConChamjoGab.liGab.get(i));
		}
	}
}