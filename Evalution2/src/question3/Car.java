package question3;

import java.util.Scanner;

public class Car {

	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}

	public void setNumberOfPassenger(int numberOfPassenger) {
		this.numberOfPassenger = numberOfPassenger;
	}

	public int getNumberOfKms() {
		return numberOfKms;
	}

	public void setNumberOfKms(int numberOfKms) {
		this.numberOfKms = numberOfKms;
	}

	int numberOfPassenger;
	int numberOfKms;

//	public Car(int numberOfPassenger, int numberOfKms) {
//		super();
//		this.numberOfPassenger = numberOfPassenger;
//		this.numberOfKms = numberOfKms;
//	}

}

class Sedan extends Car {
	final int farePerKm = 20;

}

class HatchBack extends Car {
	final int farePerKm = 15;

}

class Ola {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		if (numberOfPassenger <= 3) {
			HatchBack h1 = new HatchBack();
			h1.setNumberOfKms(numberOfKMs);
			h1.setNumberOfPassenger(numberOfPassenger);
			return h1;
		} else {
			{
				Sedan s1 = new Sedan();
				s1.setNumberOfKms(numberOfKMs);
				s1.setNumberOfPassenger(numberOfPassenger);
				return s1;
			}
		}

	}

	public int calculateBill(Car car) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number of Passenger: ");
		int numberOfPassenger = scanner.nextInt();
		System.out.println("Enter number of Kms: ");
		int numberOfKms = scanner.nextInt();
//		Car c1 = bookCar(numberOfPassenger, numberOfKms);
		Car c1 = bookCar(3, 2);
		if (c1.getNumberOfKms() <= 3) {
			HatchBack h1 = (HatchBack) c1;
			int totalFare = c1.getNumberOfPassenger() * h1.getNumberOfKms();
			return totalFare;

		} else {

			Sedan h1 = (Sedan) c1;
			int totalFare = c1.getNumberOfPassenger() * h1.getNumberOfKms();
			return totalFare;
		}

	}

}
