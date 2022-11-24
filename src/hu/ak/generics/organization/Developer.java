package hu.ak.generics.organization;

public class Developer extends Employee {

	public Developer(String name, int hourlyWage) {
		super(name, hourlyWage);
	}


	@Override
	public int getSalary() {
		return 8 * hourlyWage * 20;
	}

}
