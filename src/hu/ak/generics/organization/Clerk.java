package hu.ak.generics.organization;

public class Clerk extends Employee{

	public Clerk(String name, int hourlyWage) {
		super(name, hourlyWage);
	}

	@Override
	public int getSalary() {
		return 6 * 10 * hourlyWage;
	}

}
