package it.prova.provaset.main;

import java.util.HashSet;
import java.util.Set;

public class ProvaSet {

	public static void main(String[] args) {
		Set<String> setString = new HashSet<String>();
		setString.add("Lucia");
		setString.add("Maria");

		Set<String> setString2 = new HashSet<String>();
		setString2.add("Aurelio");
		setString2.add("Rosa");

		System.out.println(setString);
		setString.addAll(setString2);
		System.out.println(setString);
		setString.remove("Rosa");
		System.out.println(setString);
		setString.removeAll(setString2);
		System.out.println(setString);

		Set<Integer> setInteger1 = new HashSet<Integer>();
		setInteger1.add(23);
		setInteger1.add(34);
		setInteger1.add(45);
		setInteger1.add(33);

		Set<Integer> setInteger2 = new HashSet<Integer>();
		setInteger2.add(23);
		setInteger2.add(34);
		setInteger2.add(55);
		setInteger2.add(89);

		Set<Integer> set1 = new HashSet<Integer>(setInteger1);
		set1.retainAll(setInteger2);
		System.out.println("l'intersezione tra i due set è: " + set1);

	}

}
