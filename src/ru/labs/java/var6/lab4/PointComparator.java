package ru.labs.java.var6.lab4;

import java.util.Comparator;

/**
 * Мой компаратор для сравнения точек.
 * 
 *
 */
public class PointComparator implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {

		// угол отклонения от начала координат
		double angle1 = p1.getY() / p1.getX();
		double angle2 = p2.getY() / p2.getX();

		// сравниваем, если угол равен, идем к 2 признаку
		int compareByAngle = Double.compare(angle1, angle2);
		if (compareByAngle != 0) {
			return compareByAngle;
		} else {
			return Double.compare(p1.getX(), p2.getY());
		}

	}

}
