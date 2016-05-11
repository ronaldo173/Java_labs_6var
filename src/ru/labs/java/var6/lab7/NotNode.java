package ru.labs.java.var6.lab7;

public class NotNode implements AbstractNode {
	private final AbstractNode left;

	public NotNode(AbstractNode left) {
		this.left = left;
	}

	@Override
	public boolean calculate() {
		return !left.calculate();
	}

	@Override
	public String toString() {
		return "!(" + left + ")";
	}

}
