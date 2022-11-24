package hu.ak.generics.homework.commoninterface;

import java.util.HashMap;
import java.util.Map;

public class AddressBook implements Register {

	private Map<String, String> addresses;

	public AddressBook() {
		this.addresses = new HashMap<>();
	}

	@Override
	public void register(String name, String address) {
		addAddress(name, address);
	}

	@Override
	public String lookUp(String name) {
		return lookUpAddress(name);
	}

	private void addAddress(String name, String address) {
		addresses.put(name, address);
	}

	private String lookUpAddress(String name) {
		return addresses.get(name);
	}

}