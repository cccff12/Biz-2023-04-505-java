package java_800_ExamA;

public class ExamA {

	public static void main(String[] args) {
//		랜덤수를 생성하고 생성한 랜덤수가 범위에 맞는지 100번 테스트 수행
		
		
		int rndNum = (int) (Math.random() * 100) + 1;
		int index = 0;
		for (index = 0; index < 100; index++) {
			if (rndNum < 1 || rndNum > 100) {
				break;

			}
		}
//		테스트 수행 결과가 어떤지 표현
		if (index >= 100) {
			System.out.println("100번 테스트 수행결과 1~100까지의 랜덤수를 만들어 내고 있음");
		} else {
			System.out.println("테스트 횟수 " + index);
			System.out.println("100번 수행 결과" + index + "번째에서 실패함");
		}
	}

}
