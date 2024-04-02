package 프로그래밍문제4;

public class Car {
	static int numOfCar, numOfRedCar;
	
	static int getNumOfCar() {
		return numOfCar;
	}
	static int getNumOfRedCar() {
		return numOfRedCar;
	}
	
	Car(String Color){
		numOfCar++;
		if(Color.equals("red")||Color.equals("RED")) {
			
			numOfRedCar++;
		}
	}
	

}
