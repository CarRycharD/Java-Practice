package hu.ak.generics.organization;

abstract class Employee {

		protected String name;
		protected int hourlyWage;	
	
	public Employee(String name, int hourlyWage) {
			this.name = name;
			this.hourlyWage = hourlyWage;
		}

	final public String getName() {
		return name;
	}
	
	public abstract int getSalary();
	
}
