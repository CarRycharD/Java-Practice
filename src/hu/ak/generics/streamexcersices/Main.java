package hu.ak.generics.streamexcersices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person("Anna", 20, null);
		Person person2 = new Person("Béla", 67, null);
		Person person3 = new Person("Cecilía", 28, "üzleti ellemző");
		Person person4 = new Person("Dénes", 70, "projekt menedzser");
		Person person5 = new Person("Elemér", 50, "üzleti ellemző");
		Person person6 = new Person("Ferenc", 46, "programozó");

		List<Person> persons = List.of(person1, person2, person3, person4, person5, person6);
		List<Person> persons2 = new ArrayList<>();

		System.out.println(getUnemployedPersons(persons).toString());
		System.out.println("-------------------------------------------------");
		System.out.println(getNumberOfPersonsWithUniqueJobTitle(persons, "üzleti ellemző"));
		System.out.println("-------------------------------------------------");
		System.out.println(getUniqueJobTitles(persons).toString());
		System.out.println("-------------------------------------------------");
		System.out.println(getAverageAge(persons));
		System.out.println("-------------------------------------------------");
		getOldestPerson(persons);
		System.out.println("-------------------------------------------------");
		getOldestPerson(persons2);

	}

	public static List<String> getUnemployedPersons(List<Person> persons) {

		return persons.stream().filter(e -> e.getJobTitle() == null).map(e -> e.getName()).collect(Collectors.toList());

	}

	public static long getNumberOfPersonsWithUniqueJobTitle(List<Person> persons, String jobTitle) {

		return persons.stream().filter(e -> jobTitle.equals(e.getJobTitle())).count();
	}

	public static List<String> getUniqueJobTitles(List<Person> persons) {

		return persons.stream().filter(e -> e.getJobTitle() != null).map(e -> e.getJobTitle()).distinct()
				.collect(Collectors.toList());

	}

	public static double getAverageAge(List<Person> persons) {

		return persons.stream().mapToInt(e -> e.getAge()).average().getAsDouble();

	}

	public static void getOldestPerson(List<Person> persons) {

		Optional<Integer> biggestAge = persons.stream().map(e -> e.getAge()).max(Comparator.naturalOrder());

		if (biggestAge.isPresent()) {
			System.out.println(biggestAge.get());
		} else {

			throw new NoSuchElementException();

		}

	}

}
