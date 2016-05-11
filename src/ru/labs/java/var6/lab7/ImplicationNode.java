package ru.labs.java.var6.lab7;

import java.util.List;

/**
 * По сравнению с предидущей лабороторной, изменена логика чтоб узлы могли
 * поддерживать более 2х потомков.
 *
 */
public class ImplicationNode implements AbstractNode {
	private final List<AbstractNode> list;

	public ImplicationNode(List<AbstractNode> list) {
		this.list = list;
	}

	/**
	 * Операция импликации может быть осуществлена с помощью логических
	 * операторов ! и |: !р | q
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
