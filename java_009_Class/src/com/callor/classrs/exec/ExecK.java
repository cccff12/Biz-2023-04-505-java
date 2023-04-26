package com.callor.classrs.exec;

public class ExecK {
	public static void main(String[] args) {
		int[] num = new int[50];
//for문이 여기서는 i가 0~49까지다
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 50) + 51;
			System.out.print(num[i]+"\t");
			//i가 1부터 시작하도록 만드는 if문
			if ((i+1) % 5 == 0) {
				System.out.println();
			}

		}

	}
}
// for문으로 배열을 50개 랜덤값으로 만들고 println 말고 print로 바로 출력한다
// 그러면 한줄로 쭉 이어지게 될텐데 거기에 +\t를 한다면 50개가 띄어쓰기로 한줄로 나열된다.
// 그리고 5개마다 띄우려면 if문을 5로 나눠졌을때 통과하게 하면 되는데 i는 0부터 시작하게 된다면
// 0은 모든 값의 배수니까 첫번쨰 배열 후 한칸이 띄워지게 된다. 그러니 (i+1)% 5==0으로 설정을 한다면
// 조건이 만족된다. if문의 출력 값은 그냥 println로 하면 알아서 띄워진다.+\n을 하면 두줄이 띄워지니 조심