package hu.ak.generics.homework.commoninterface;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		AddressBook addressBook = new AddressBook();
		PhoneBook phoneBook = new PhoneBook();
		
		register(addressBook, "László", "9774 Sorkifalud Belgrád rkp. 90.");
		register(phoneBook, "László", "(20) 976-240");
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Name: ");
		final String nameToLookUp = scanner.nextLine();

		String address = lookUp(addressBook, nameToLookUp);
		String phoneNumber = lookUp(phoneBook, nameToLookUp);

		System.out.println("Cím: " + (address == null ? "Nincs adat" : address));
		System.out.println("Telefonszám: " + (phoneNumber == null ? "Nincs adat" : phoneNumber));
	}

    // Ezen a ponton az alábbi két metódus fordítási hibát produkál
    // A feladat sikeres megoldásával ezek kijavulnak
    
	public static void register(Register register, String name, String data) {
		register.register(name, data);
	}
	
	public static String lookUp(Register register, String name) {
		return register.lookUp(name);
	}

}