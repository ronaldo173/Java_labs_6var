package ru.labs.java.var6.lab6;

public class SimpleNode implements AbstractNode {
	private final boolean value;

	public SimpleNode(boolean value) {
		super();
		this.value = value;
	}

	@Override
	public boolean calculate() {
		return value;
	}

	@Override
	public String toString() {
		return "SimpleNode [value=" + value + "]";
	}
	
	

}
