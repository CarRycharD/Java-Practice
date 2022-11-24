package hu.ak.generics.organization;

public class Manager extends Employee {

	protected int numberOfProjects;
	
	public Manager(String name, int hourlyWage, int numberOfProjects) {
		super(name, hourlyWage);
		this.numberOfProjects = numberOfProjects;
	}

	@Override
	public int getSalary() {
		return numberOfProjects * 3 * hourlyWage * 20;
	}

}
