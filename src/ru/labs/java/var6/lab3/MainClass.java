package ru.labs.java.var6.lab3;

public class MainClass {
	private static AbstractNode generateFirst() {
		return new MultNode(new AddNode(new SimpleNode(7), new SimpleNode(5)),
				new AddNode(new SimpleNode(3), new SimpleNode(4)));
	}

	private static AbstractNode generateSecond() {
		return new AddNode(new MultNode(new SimpleNode(7), new SimpleNode(5)),
				new MultNode(new SimpleNode(2), new SimpleNode(4)));
	}

	public static void main(String[] args) {
		AbstractNode first = generateFirst();
		AbstractNode second = generateFirst();

		System.out.println("First: " + first + "\tValue is: " + first.calculate());
		System.out.println("Second: " + first + "\tValue is: " + second.calculate());
	}
}
