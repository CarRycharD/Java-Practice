package hu.ak.generics.homework.polymorphicvehicles;

public class Car extends Vehicle {

	protected String registrationNumber;

	public Car(int speed, String registrationNumber) {
		super(speed);
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	@Override
	public void speedUp() {
		speed += 2;
		System.out.println("A jármű gyorsul " + speed + " sebességre.");
	}

	@Override
	public void slowDown() {
		speed -= 2;
		System.out.println("A jármű lassul " + speed + " sebességre.");
	}
}
