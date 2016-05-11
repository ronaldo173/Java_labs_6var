package ru.labs.java.var6.lab3;

public class MultNode implements AbstractNode {
	private final AbstractNode left;
	private final AbstractNode right;
	
	public MultNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public int calculate() {
		return left.calculate() * right.calculate();
	}

	@Override
	public String toString() {
		return "(" + left + ") * (" + right + ")";
	}
	
	

}
