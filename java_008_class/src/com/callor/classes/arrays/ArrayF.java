package com.callor.classes.arrays;

public class ArrayF {
/*
 * prime()method에게 정수값 1개를 전달하고 
 * 그 정수값이 소수인지 아닌지 알려달라 요청한것
 */
	public static int prime(int ran) {

		int i;
		for (i = 2; i < ran; i++) {
			if (ran % i == 0) {
				return 0;
			}

		}
		return ran;

	}
	/*
	 * 다수의 데이터를 정보처리할 경우 데이터를 수집하고, 수지빙 완료되었을때
	 * 한꺼번에 처리를 한다
	 * 
	 * 실시간 처리: 데이터가 발생하는 즉시 처리
	 * 배치(Batch)처리: 데이터를 모두 수집하고 수집이 완료되었을때 처리 ex) 급여계산, 인구통계
	 * 
	 */
	public static void main(String[] args) {

		int[] num = new int[10];

		for (int i = 0; i < 10; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
		for (int i = 0; i < 10; i++) {
			if (prime(num[i]) > 0) {
				System.out.println(num[i] + "소수");
			} else {
				System.out.println(num[i] + "소수아님");

			}
		}
	}

}
