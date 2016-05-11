package ru.labs.java.var6.lab3____1;

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
