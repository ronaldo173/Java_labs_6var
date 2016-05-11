package ru.labs.java.var6.lab3;

public class SimpleNode implements AbstractNode {
	private final int value;

	public SimpleNode(int value) {
		super();
		this.value = value;
	}

	@Override
	public int calculate() {
		return value;
	}

	@Override
	public String toString() {
		return "SimpleNode [value=" + value + "]";
	}
	
	

}
