package com.callor.classrs.exec;

public class ExecF {

	public static void main(String[] args) {
		int[] num = new int[10];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
// 배열의 요소에 저장된 값 중에서 최초로 5의 배수가 저장된 위치 찾기
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 5 == 0) {
				System.out.printf("최초의 5의 배수:%d \n index값:%d", num[i], i);
				break;
			}

		}
		// int타입 num 배열을 선언 및 초기화하고 for문에서 0~9번까지 랜덤값을 지정한다.
		// 그리고 출력할 for문에서 if문을 이용해 5로 나눠지면 출력하는 것으로 설정한다
		// 그리고 for문은 계속 반복하기 때문에 if문에서 출력후 반복하지 않게 break문을 넣는다
	}
}
