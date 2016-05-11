package ru.labs.java.var6.lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferRead = null;
		try {
			bufferRead = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the number of elements: ");
			int N = Integer.parseInt(bufferRead.readLine());
			System.out.println("Enter the elements themselves(N): ");
			ListElement first = null;
			for (int i = 0; i < N; i++) {
				String value = bufferRead.readLine();
				first = ListUtils.insert(first, value);
			}


			ListElement listElementAfterFilter = ListUtils.filter(first);
			String result = ListUtils.reduce(listElementAfterFilter, ListUtils.getSizeOfList(listElementAfterFilter) -1);

			System.out.println(result);
			System.out.println("...finished");
		} finally {
			bufferRead.close();
		}

	}

}
