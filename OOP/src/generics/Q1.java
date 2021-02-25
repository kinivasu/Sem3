package generics;

import java.util.*;

class Gen<T> {
	T ob;

	Gen(T o) {
		ob = o;
	}

	T getob() {
		return ob;
	}
}

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer n[] = { 21, 32, 43, 54, 65, 76 };

		System.out.print("Array Before Swap:  ");
		for (int k = 0; k < n.length; k++) {
			System.out.print(n[k] + " ");
		}
		System.out.println();

		System.out.print("Enter the Positions to be swapped:  ");
		int x = sc.nextInt();
		int y = sc.nextInt();

		exchange(n, x - 1, y - 1);

		System.out.print("Array After Swap:  ");
		for (int k = 0; k < n.length; k++) {
			System.out.print(n[k] + " ");
		}
		System.out.println();
	}

	static <T> void exchange(T n[], int i, int j) {
		T temp;
		temp = n[i];
		n[i] = n[j];
		n[j] = temp;
	}

}