package com.callor.classrs.exec;

public class ExecH {

	public static void main(String[] args) {
		int[] num = new int[50];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
// 조건에 맞는 개수와 조건에 맞는 값의 합계를 계산 개수와 합계를 저장할 변수를 먼저 선언
		}
		int count = 0;
		int sum3 = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				sum3 += num[i];
				count++;
			}

		}

		System.out.println(sum3 + "     3의 배수의 합계");
		System.out.println(count + "      3의 배수의 개수");
	}
}

// 이 경우 배열 50개를 초기화 하고 첫 for에 배열마다 랜덤수를 부여하고
// 3의 개수와 합계를 담을 변수를 2개 초기화 한 후 if조건문에 배열의 요소가 3으로 나누어 떨어진다면
// 개수는 ++로 카운트 하고 합은 선언한 변수에 +=num[i] 해서 계속 누적시키게 조건을 설정한다.
//그리고 for 문이 끝나면 합계와 카운트를 프린트한다