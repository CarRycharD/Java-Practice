package hu.ak.generics.homework.commoninterface;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook implements Register {
	
	private Map<String, String> phoneNumbers;
	
	public PhoneBook() {
		this.phoneNumbers = new HashMap<>();
	}

	@Override
	public void register(String name, String phoneNumber) {
		addPhoneNumber(name, phoneNumber);
	}
	
	private void addPhoneNumber(String name, String phoneNumber) {
		phoneNumbers.put(name, phoneNumber);
	}
	
	@Override
	public String lookUp(String name) {
		return lookUpPhoneNumber(name);
	}
	
	private String lookUpPhoneNumber(String name) {
		return phoneNumbers.get(name);
	}
	
}