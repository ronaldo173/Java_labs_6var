package ru.labs.java.var6.lab3____1;

public class ImplicationNode implements AbstractNode {
	private final AbstractNode left;
	private final AbstractNode right;

	public ImplicationNode(AbstractNode left, AbstractNode right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * �������� ���������� ����� ���� ������������ � ������� ����������
	 * ���������� ! � |: !� | q
	 */
	@Override
	public boolean calculate() {
		return !left.calculate() | right.calculate();
	}

	@Override
	public String toString() {
		return "ImplicationNode [left=" + left + ", right=" + right + "]";
	}

}
