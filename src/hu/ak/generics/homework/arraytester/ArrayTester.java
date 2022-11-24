package hu.ak.generics.homework.arraytester;

final class ArrayTester {

	public static boolean equivalent(Object[] a, Object[] b) {

		if (a == null || b == null) {
			return false;
		}

		if (a.length != b.length) {
			return false;
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}

	public static boolean equivalent(Object[] a, Object[] b, Object[] c) {

		return equivalent(a, b) && equivalent(a, c);

	}

}