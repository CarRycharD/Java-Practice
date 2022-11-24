package hu.ak.generics.homework.densetosparevector;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DenseToSpareVector {

	public static void main(String[] args) {

		int[] denseVector = { 0, 0, 0, 1, 0, 0, 2, 3 };
		Map<Integer, Integer> sparesVector = new HashMap<>();

		for (int i = 0; i < denseVector.length; i++) {
			if (denseVector[i] != 0) {
				sparesVector.put(i, denseVector[i]);
			}
		}

		System.out.println("Sparse vector: ");
		for (Entry<Integer, Integer> entry : sparesVector.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

}
