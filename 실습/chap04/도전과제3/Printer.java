package 도전과제3;

public class Printer {
	private int numOfPapers;
	private boolean duplex;
	
	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	public void print(int amount) {
		if(duplex == true) {
			if((amount/2)==0) {
				numOfPapers-=amount/2;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount/2), numOfPapers);
			}
			else {
				numOfPapers -= (amount/2)+1;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아 있습니다.\n", (amount/2)+1, numOfPapers);
			}
		}
		else {
			numOfPapers -= amount;
			amount+= numOfPapers;
			System.out.printf("단면으로 모두 출력하려면 용지가 %d매 부족합니다. %d장만 출려합니다.\n", -numOfPapers, amount);
			}
		}
	
	
	public boolean getDuplex() {
		return duplex;
	}
	
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}
}