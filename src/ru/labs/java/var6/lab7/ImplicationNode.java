package ru.labs.java.var6.lab7;

import java.util.List;

/**
 * �� ��������� � ���������� ������������, �������� ������ ���� ���� �����
 * ������������ ����� 2� ��������.
 *
 */
public class ImplicationNode implements AbstractNode {
	private final List<AbstractNode> list;

	public ImplicationNode(List<AbstractNode> list) {
		this.list = list;
	}

	/*
	 * я импликации может быть осуществлена с помощью логических операторов ! и
	 * |: !р | q
	 */
	@Override
	public boolean calculate() {
		boolean result = false;
		for (AbstractNode node : list) {
			result |= node.calculate();
		}

		return result;

	}

	@Override
	public String toString() {
		String result = "";
		boolean first = true;

		for (AbstractNode node : list) {
			if (!first)
				result += " ==>";
			first = false;

			result += "(" + node + ")";
		}
		return "ImplicationNode " + result;
	}

}
