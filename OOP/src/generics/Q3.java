package generics;

import java.util.*;

class Q3 {
	private static void printlist(List<?> list) {
		System.out.println(list);
	}

	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("manipal", "MIT", "CSE");
		List<Integer> list2 = Arrays.asList(11, 23, 46);
		printlist(list1);
		printlist(list2);
	}
}