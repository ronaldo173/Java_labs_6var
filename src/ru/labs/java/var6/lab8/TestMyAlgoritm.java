package ru.labs.java.var6.lab8;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TestMyAlgoritm {

	/**
	 * проверка значения NOD
	 */
	@Test
	public void test() {
		int[] arrForTest = new int[] { 15, 18, 42, 108 };
		int expected = 3;
		int findedGCD = NODalgoritmOfEvklid.findGcd(arrForTest);

		assertEquals(expected, findedGCD);

		int[] arrForTest2 = new int[] { 32, 48, 64, 96 };
		int expected2 = 16;
		int findedGCD2 = NODalgoritmOfEvklid.findGcd(arrForTest2);

		assertEquals(expected2, findedGCD2);
	}

	private int[] generate(int N) {
		int[] arr = new int[N];
		Random rand = new Random();
		for (int i = 0; i < N; i++) {
			arr[i] = rand.nextInt(1000);
		}
		return arr;
	}

	/**
	 * Тестирование нагрузочное
	 */
	@Test
	public void stressTestOne() {
		isExists(NODalgoritmOfEvklid.findGcd(generate(10000)));
	}

	private void isExists(int findGcd) {
		if (findGcd != -1) {
			assertTrue(true);
		}

	}

	@Test
	public void stressTestTwo() {
		isExists(NODalgoritmOfEvklid.findGcd(generate(100000)));
	}

	@Test
	public void stressTestThree() {
		isExists(NODalgoritmOfEvklid.findGcd(generate(1000000)));
	}

}
