package chowdeswari;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		numbers.add(50);
		numbers.add(20);
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		numbers.add(60);
		System.out.println(numbers);
		System.out.println(numbers.first());
		System.out.println(numbers.higher(30));

	}

}