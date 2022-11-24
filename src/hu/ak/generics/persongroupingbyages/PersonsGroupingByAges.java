package hu.ak.generics.persongroupingbyages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonsGroupingByAges {

	public static void main(String[] args) {

		List<Person> persons = List.of(new Person("Péter", 26), new Person("Béla", 12), new Person("Tamás", 12),
				new Person("Cili", 14), new Person("András", 50), new Person("Szilvi", 26), new Person("Zita", 45),
				new Person("Cintia", 12));

		Map<Integer, List<Person>> personsByAge = new HashMap<>();

		ageSorter(persons, personsByAge);

		sortedPrinter(personsByAge);

	}

	public static void ageSorter(List<Person> persons, Map<Integer, List<Person>> personsByAge) {

		for (Person person : persons) {

			int age = person.getAge();

			if (!personsByAge.containsKey(age)) {

				personsByAge.put(age, new ArrayList<>());

			}

			personsByAge.get(age).add(person);

		}

	}

	public static void sortedPrinter(Map<Integer, List<Person>> personsByAge) {

		List<Integer> sortedKeys = new ArrayList<>(personsByAge.keySet());

		Collections.sort(sortedKeys);

		for (Object key : sortedKeys) {

			System.out.println(key + " " + personsByAge.get(key));

		}

	}

}
