package ru.labs.java.var6.lab3;

public class AddNode implements AbstractNode {
	private final AbstractNode left;
	private final AbstractNode right;

	public AddNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int calculate() {
		return left.calculate() + right.calculate();
	}

	@Override
	public String toString() {
		return "AddNode [left=" + left + ", right=" + right + "]";
	}
	
	
}
