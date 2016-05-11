package ru.labs.java.var6.lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class ListUtils {

	/**
	 * Вставка элементов.
	 * @param first
	 * @param value
	 * @return
	 */
	public static ListElement insert(ListElement first, String value) {
		if (first == null) {
			return new ListElement(value);
		} else {
			ListElement p = first;

			while (p.getNext() != null) {
				p = p.getNext();
			}
			p.setNext(new ListElement(value));
			return first;
		}
	}

	/**
	 * Фильтрация списка, строки содержат только буквы.
	 * @param first
	 * @return
	 */
	public static ListElement filter(ListElement first) {
		ListElement p = null;

		while (first != null) {
			if (checkAllAlphabeticLetters(first.getValue()))
				p = insert(p, first.getValue());
			first = first.getNext();
		}
		return p;
	}

	/**
	 * Проверяем все ли символы строки - буквы.
	 * 
	 * @param value строка
	 * @return true если нет ничего кроме букв
	 */
	private static boolean checkAllAlphabeticLetters(String value) {

		if (Pattern.matches("[a-zA-Z]+", value))
			return true;

		return false;
	}

	/**
	 * Конкатенация строк, рекурсивный алгоритм!
	 * 
	 * @param first
	 * @return
	 */
	public static String reduce(ListElement first,int n) {	
		String[] elements = getArrayFromList(first);
		if(n==0){
			return elements[n];
		}
		else{
			return elements[n] + reduce(first, n-1);
		}
	}

	/**
	 * ПРеобразовывает лист в массив чтоб рекурсивно конкатенировать строки.
	 * @param first
	 * @return
	 */
	private static String[] getArrayFromList(ListElement first) {
		List<String> list = new ArrayList<>();
		while (first != null) {
			list.add(first.getValue());
			first = first.getNext();
		}
		return list.toArray(new String[list.size()]);
	}

	/*
	 * Получаем размер листа.
	 */
	public static int getSizeOfList(ListElement first) {
		int size = 0;
		while (first != null) {
			size++;
			first = first.getNext();
		}
		return size;
	}

	/**
	 * Тестируем работу алгоритма.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(checkAllAlphabeticLetters("abs"));
		System.out.println(checkAllAlphabeticLetters("abs2"));

		ListElement first = null;
		first = ListUtils.insert(first, "first");
		first = ListUtils.insert(first, "second");
		first = ListUtils.insert(first, "last");
		first = ListUtils.insert(first, "last2");
//		String result = ListUtils.reduce(ListUtils.map(ListUtils.filter(first)), getSizeOfList(first)-1);
//		System.out.println(result);
		
		ListElement listElement = filter(first);	
		String[] arrayFromList = getArrayFromList(listElement);
		System.out.println(Arrays.toString(arrayFromList));
		
		String reduce = reduce(listElement, 2);
		System.out.println(reduce);
		
	}
}
