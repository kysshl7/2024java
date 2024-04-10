package 프로그래밍문제;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Star[] = new String[10];
		int hist[] = new int[10];
		System.out.println("숫자를 10개 입력하세요.");
		for(int i=0; i<10; i++) {
			Star[i]="";
		}
		for(int j=0;j<10;j++) {
			int number = in.nextInt();
			hist[j]=j;
			if(number>=90 && number<100) {
				Star[9] += "*";
			}
			else if(number>=80) {
				Star[8] += "*";
			}
			else if(number>=70) {
				Star[7] += "*";
		    }
			else if(number>=60) {
				Star[6] += "*";
		
	        }
			else if(number>=50) {
				Star[5] += "*";

            }
			else if(number>=40) {
				Star[4] += "*";
	        }
			else if(number>=30) {
				Star[3] += "*";
			}
			else if(number>=20) {
				Star[2] += "*";
			}
			else if(number>=10) {
				Star[1] += "*";
			}
			else if(0<number && number<10) {
				Star[0] += "*";
			}
		}
		for(int i=0; i<Star.length; i++) {
			if(i==0) {
				System.out.println(""+hist[i]*10+" ~ "+(hist[i]*10+9)+" : "+Star[i]);
			}
			else {
				System.out.println(""+hist[i]*10+" ~ "+(hist[i]*10+9)+" : "+Star[i]);
			}
		}
	}
}
