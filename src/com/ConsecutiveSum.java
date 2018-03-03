package com;

import java.util.Scanner;

public class ConsecutiveSum {

	static int consecutive(long num) {
		int count = 0;
		long limit = num / 2;
		long sum;
		for (long counter = 1; counter <= limit; counter++) {
			sum = 0;
			for (long start = counter; start <= limit; start++) {
				sum = sum + start;
				if (sum == num) {
					count++;
					break;
				}

			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("Enter a num ranging from 1 to 10^12:\n");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int count = consecutive(Long.parseLong(input));
		System.out.println("Total no of ways:" + count);
	}
}