package ru.labs.java.var6.lab8;

/**
 * ��� ������� �����
 *
 */
public class NODalgoritmOfEvklid {

	public static int findGcd(int... numbers) {

		// ������� ����������� ������� �������
		int smallest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		// ���� GCD
		while (smallest > 1) {

			int counter = 0;
			int modTot = 0;

			while (counter < numbers.length) {

				modTot += numbers[counter] % smallest;
				counter++;

			}

			if (modTot == 0) {
				return smallest;
			}
			smallest--;

		}
		// ���� ��� ���������� -1
		return -1;
	}

	public static void main(String[] x) {
		System.out.println("The GCD of 15 18 42 108 : " + findGcd(new int[] { 15, 18, 42, 108 }));
	}
}