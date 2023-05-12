package t1;

public class random {
	public static void main(String[] args) {

		int sum = 0;
		for (int i = 0; i < 100; i++) {
			int ran = (int) (Math.random() * 50) + 51;
			++sum;
			if (sum == 100) {
				System.out.println("테스트 횟수 : " + sum);
				System.out.println(sum + "번 테스트 수행 결과 1~100까지의 범위의 랜덤수를 만들어 내고 있음");
			}else {
				System.out.println("테스트 횟수 : " + sum);
				System.out.println("100번의 테스트를 수행하려고 하였으나" +sum+"번째 테스트에서 실패함");
			}
		}
	}
}
