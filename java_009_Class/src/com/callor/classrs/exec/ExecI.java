package com.callor.classrs.exec;

public class ExecI {
	public static void main(String[] args) {

		int[] num = new int[50];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
		}
		int lastnum = 0;
/*
 * lastindex 초기화를 0으로 실행할 경우 만약 배열에 담긴 값 중에 3의 배수가 하나도 없을 경우 
 * lastindex는 0이 될 것이고 결과 출력에서 0의 index와 index0의 요소값이 출력된다
 * 이러한 논리적인 문제를 해결하기위해 lastindex를 -1로 초기화 하고 결과 출력 부분에서 lastindex의 값을 
 * 한번더 검사할 필요가 있다.
 * 
 * 어차피 3의 배수면 for 문 안에서 i로 초기화 될 것이니 영향은 없다.
 */
		
		
		int lastindex = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 3 == 0) {
				lastnum = num[i];
				lastindex = i;
			}
		}

		System.out.println("마지막 값은 : "+lastnum);
		System.out.println("마지막 index는: "+lastindex);
	}
}

// num배열 50개에 랜덤값을 저장하고 마지막 index와 값을 출력 
// 첫 for에 랜덤값을 각자 저장해주고 마지막 인덱스와 마지막 3의 배수 값을 for문이 끝나고 가져오기 위해
// 두번째 for문 전에 변수값 2개를 지정해준다 그리고 2번째 for문의 if문 안에서 3의 배수로 조건을 맞추고 
// 누적이 아니라 변수=num[i], 변수=i 를 하면 마지막 값이 그대로 저장되어 나온다. 이때 변수에 마지막 값을 저장 
// 안한다면 for문의 끝남과 동시에 삭제가 되니 변수에 저장하여 출력해야 한다



