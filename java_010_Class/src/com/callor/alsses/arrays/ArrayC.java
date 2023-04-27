package com.callor.alsses.arrays;

public class ArrayC {
	public static void main(String[] args) {
		int[] num = new int[45];

		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;

		}

		for (int i = 0; i < 1000; i++) {
			int index1 = (int) (Math.random() * num.length);
			int index2 = (int) (Math.random() * num.length);

			int tmp = num[index1];
			num[index1] = num[index2];
			num[index2] = tmp;

		}

		for (int i = 0; i < 6; i++) {
			System.out.printf("%d\t", num[i]);

		}
		System.out.println();
		// int[] lottos = { num[0], num[1], num[2], num[3], num[4], num[5] };
		int[] lottos = new int[6];

		for (int i = 0; i < lottos.length; i++) {
			lottos[i] = num[i];

		}

		for (int i = 0; i < lottos.length; i++) {
			for (int ii = i + 1; ii < lottos.length; ii++) {
				if (lottos[i] > lottos[ii]) {
					int tmp = lottos[ii];
					lottos[ii] = lottos[i];
					lottos[i] = tmp;

				}
			}

		}
		System.out.println();
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%d\t", lottos[i]);
		}

		for (int out = 0; out < lottos.length; out++) {
			for (int in = out + 1; in < lottos.length; in++) {
				if (lottos[out] > lottos[in]) {
					int _tmp = lottos[in];
					lottos[in] = lottos[out];
					lottos[out] = _tmp;

				}

			}

		}
		System.out.println();
		for (int i = 0; i < lottos.length; i++) {
			System.out.printf("%2d\t", lottos[i]);

		}
	}
}