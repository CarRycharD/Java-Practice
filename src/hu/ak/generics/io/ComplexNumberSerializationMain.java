package hu.ak.generics.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ComplexNumberSerializationMain {

	static void writeBinary(ComplexNumber complexNumber, String fileName) {
		try (FileOutputStream out = new FileOutputStream(fileName); ObjectOutputStream objStream = new ObjectOutputStream(out)){
			objStream.writeObject(complexNumber);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	static ComplexNumber readBinary(String fileName) {
		try(FileInputStream in = new FileInputStream(fileName); ObjectInputStream objStream = new ObjectInputStream(in)) {
			ComplexNumber number = (ComplexNumber) objStream.readObject();
			return number;
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

	static void writeTextual(ComplexNumber complexNumber, String fileName) {
		try (FileWriter writer = new FileWriter(fileName)) {
			writer.write(complexNumber.getReal() + "," + complexNumber.getImaginary());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	static ComplexNumber readTextual(String fileName) {
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName));) {
			String str = reader.readLine();
			String[] strs = str.split(",");
			ComplexNumber number = new ComplexNumber(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]));
			return number;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	static String FILE_NAME_TXT = "C:\\Users\\anony\\Desktop\\New folder\\c.txt";
	static String FILE_NAME_BIN = "C:\\Users\\anony\\Desktop\\New folder\\c.bin";

	public static void main(String[] args) {
		String fileNametxt = FILE_NAME_TXT;
		String fileNameBin = FILE_NAME_BIN;
		ComplexNumber number1 = new ComplexNumber(1, 1);
		ComplexNumber number2 = new ComplexNumber(1, 2);
		writeBinary(number1, fileNameBin);
		System.out.println(readBinary(fileNameBin));
		writeTextual(number2, fileNametxt);
		System.out.println(readTextual(fileNametxt));
	}

}
