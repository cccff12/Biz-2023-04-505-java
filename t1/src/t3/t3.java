package t3;

import java.util.ArrayList;
import java.util.List;

public class t3 {

	public static void prime() {

		List<Integer> numList = new ArrayList<>();
		int num = 0;
		int sum = 0;
		for (int i = 0; i < 30; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			numList.add(ran);
		}
		for (int i = 2; i < numList.size(); i++) {
			if (numList.get(i) % i != 0) {
				++num;
				sum += numList.get(i);
			}
		}
		System.out.println("소수의 개수 : " + num);
		System.out.println("소수의 합 : " + sum);

	}

	public static void main(String[] args) {
		prime();
	}
}
