package 도전과제;

public class Printertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer demoPrinter = new Printer();   // 객체 생성

		
		demoPrinter.numOfPapers = 100;         // 용지 100장 추가
		demoPrinter.print(70);                 // 70장 출력

		System.out.println(demoPrinter.numOfPapers);
	}

}
