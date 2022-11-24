package hu.ak.generics.homework.polymorphicvehicles;

public class Vehicle {
	
	protected int speed;

	public Vehicle(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void speedUp() {
		speed += 1;
		System.out.println("A jármű gyorsul " + speed + " sebességre.");
	}
	
	public void slowDown() {
		speed -= 1;
		System.out.println("A jármű lassul " + speed + " sebességre.");
	}
	
	public void stop() {
		speed = 0;
		System.out.println("A jármű megállt.");
	}
	
}
