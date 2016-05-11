package ru.labs.java.var6.lab3____1;

public class MainClass {
	private static AbstractNode generateFirst() {
		return new ImplicationNode(new ImplicationNode(new SimpleNode(true), new NotNode(new SimpleNode(false))), 
				new NotNode(new SimpleNode(true)));
	}

	private static AbstractNode generateSecond() {
		return new NotNode(new ImplicationNode(new NotNode(new SimpleNode(true)), new NotNode(new SimpleNode(false))));
	}

	public static void main(String[] args) {
		AbstractNode first = generateFirst();
		AbstractNode second = generateSecond();

		System.out.println("First: " + first + "\tValue is: " + first.calculate());
		System.out.println("Second: " + first + "\tValue is: " + second.calculate());
	}
}
