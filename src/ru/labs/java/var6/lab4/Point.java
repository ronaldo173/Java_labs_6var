package ru.labs.java.var6.lab4;

/**
 * Моя точка с координатам х,у
 */
public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		double angle = (double)this.y/this.x;
		return "(" + x + "," + y +") - <���� ���������� = " + angle + ">";
	}
	
	

}
