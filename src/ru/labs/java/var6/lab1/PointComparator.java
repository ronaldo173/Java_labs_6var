package ru.labs.java.var6.lab1;

import java.util.Comparator;

/**
 * ��� ���������� ��� ��������� �����.
 * 
 *
 */
public class PointComparator implements Comparator<Point> {

	@Override
	public int compare(Point p1, Point p2) {

		// ���� ���������� �� ������ ���������
		double angle1 = p1.getY() / p1.getX();
		double angle2 = p2.getY() / p2.getX();

		// ����������, ���� ���� �����, ���� � 2 ��������
		int compareByAngle = Double.compare(angle1, angle2);
		if (compareByAngle != 0) {
			return compareByAngle;
		} else {
			return Double.compare(p1.getX(), p2.getY());
		}

	}

}
