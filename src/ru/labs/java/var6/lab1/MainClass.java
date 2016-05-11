package ru.labs.java.var6.lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	private Point read(Scanner sc) {
		System.out.println("Please enter point 2 int x,y: ");
		int x = Integer.parseInt(sc.next());
		int y = Integer.parseInt(sc.next());
		return new Point(x, y);
	}

	private void run() {
		List<Point> list = new ArrayList<>();
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			for (int i = 0; i < 5; i++) {
				list.add(read(sc));
			}
		} finally {
			sc.close();
		}
		/*
		 * //заполняем список для теста list.add(new Point(1, 2)); list.add(new
		 * Point(4, 6)); list.add(new Point(8, 4)); list.add(new Point(4, 4));
		 * list.add(new Point(2, 2));
		 */

		sort(list);
	}

	private void sort(List<Point> list) {
		Collections.sort(list, new PointComparator());
		for (Point point : list) {
			System.out.println(point);
		}
	}

	public static void main(String[] args) {
		new MainClass().run();
	}
}