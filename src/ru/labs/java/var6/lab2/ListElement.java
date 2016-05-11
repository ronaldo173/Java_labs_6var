package ru.labs.java.var6.lab2;

/**
 * ��� ������ �����.
 *
 */
public class ListElement {
	private final String value;
	private ListElement next;

	public ListElement(String value) {
		super();
		this.value = value;
	}

	public ListElement getNext() {
		return next;
	}

	public void setNext(ListElement next) {
		this.next = next;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "ListElement [value=" + value + "]";
	}

	
}
