package hu.ak.generics.homework.polymorphicvehicles;

public class Motorway {

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle(10);
		Car car = new Car(0, "ABC 123");

		drive(vehicle);
		drive(car);

	}

	public static void drive(Vehicle vehicle) {

		while(vehicle.speed < 20) {
			vehicle.speedUp();
		}
		
		while(vehicle.speed > 10) {
			vehicle.slowDown();
		}
		
		vehicle.stop();
		
		if (vehicle instanceof Car) {
			
			Car car = (Car) vehicle;
			
			System.out.println("A rendszám: " + car.getRegistrationNumber());
		}

	}
}
