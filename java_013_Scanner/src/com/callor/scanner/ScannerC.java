package com.callor.scanner;

import com.callor.scanner.service.PrimeServiceV1;

public class ScannerC {
	public static void main(String[] args) {
		PrimeServiceV1 pservice = new PrimeServiceV1();

		while (true) {
			int num = pservice.getNum();
			if (num < 0) {
				break;
			}

			int result = pservice.primeYesNo(num);
			if (result > 0) {
				System.out.println(num + "는 소수");
			} else {
				System.out.println(num + "는 소수아님");
			}
		}

	}
}
