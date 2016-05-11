package ru.labs.java.var6.lab7;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	private static AbstractNode generateFirst() {
		List<AbstractNode> list = new ArrayList<>();
		list.add(new SimpleNode(true));
		list.add(new NotNode(new SimpleNode(true)));
		list.add(new NotNode(new SimpleNode(false)));

		return new ImplicationNode(list);

	}

	private static AbstractNode generateSecond() {
		List<AbstractNode> list = new ArrayList<>();
		list.add(new NotNode(new SimpleNode(true)));
		list.add(new NotNode(new SimpleNode(false)));

		return new NotNode(new ImplicationNode(list));
	}

	public static void main(String[] args) {
		AbstractNode first = generateFirst();
		AbstractNode second = generateSecond();

		System.out.println("First: " + first + "\tValue is: " + first.calculate());
		System.out.println("Second: " + second + "\tValue is: " + second.calculate());
	}
}
