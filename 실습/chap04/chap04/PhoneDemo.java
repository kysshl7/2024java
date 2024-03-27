package chap04;

class Phone {
	String model;
	int value;

	void printInfo() {
		int localvalue;
		System.out.println("phone " + model + "  value=" + this.value);
	}

}

public class PhoneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone myPhone;
		myPhone = new Phone();

		Phone yourPhone = new Phone();

		myPhone.model = "iphone";
		myPhone.value = 14;

		yourPhone.model = "Galaxy";
		yourPhone.value = 24;

		System.out.println("Myphone " + myPhone.model + "  value=" + myPhone.value);
		yourPhone.printInfo();

	}

}
