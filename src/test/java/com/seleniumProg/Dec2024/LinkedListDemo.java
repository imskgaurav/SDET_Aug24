package com.seleniumProg.Dec2024;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		ll.add(new String("physics"));
		ll.add(new String("Chemistry"));
		ll.add(new String("Maths"));
		ll.add(new String("Java"));

		System.out.println(ll);

		ll.add(2, null);

		ll.addFirst("Bio");
		System.out.println(ll);

	}

}
