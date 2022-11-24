package hu.ak.generics.organization;

public class OrganizationMain {

	public static void main(String[] args) {
		
		Developer developer = new Developer("Deve Lopez", 1400);
		Manager manager = new Manager("Mene Gergely", 2000, 5);
		Clerk clerk = new Clerk("Clerk Kent", 1000);
		
		Employee[] employees = {developer, manager, clerk};
		
		for(Employee employee : employees) {
			System.out.println("Name: " + employee.getName() + "(" + employee.getSalary() + ")");
		}
		
	}
	
}
