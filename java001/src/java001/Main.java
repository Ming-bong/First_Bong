package java001;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

		System.out.print(fx(num1));
	}

	public static int fx(int num) {
		int count = 0;

		if (num < 100) {
			return num;
		} else {
			count = 99;
			for (int i = 100; i <= num; i++) {

				int a = i / 100;
				int b = (i / 10) % 10;
				int c = (i % 10);

				if ((b - a) == (c - b)) {
					count++;
				}

			}
		}
		return count;
	}
}