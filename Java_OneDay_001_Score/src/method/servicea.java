package method;

import scoreDto.ScoreDto;

public class servicea {

	public int ran() {
		int ran = (int) (Math.random() * 50) + 51;
		return ran;
	}

	public void print(ScoreDto score) {
		System.out.print(score.num + "\t");
		System.out.printf("%3d\t", score.kor);
		System.out.printf("%3d\t", score.eng);
		System.out.printf("%3d\t", score.math);
		System.out.printf("%3d\t", score.music);
		System.out.printf("%3d\t", score.art);
		System.out.printf("%3d\t", score.total());
		System.out.printf("%5.2f\n", score.avg());
	}

	public void addprint(int num1, int num2, int num3, int num4, int num5, int num6) {
		System.out.printf("총점\t%d\t%d\t%d\t%d\t%d\t%d\n", num1, num2, num3, num4, num5, num6);
	}

	public void avgprint(float num1, float num2, float num3, float num4, float num5, float num6) {
		System.out.printf("평균\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t\t%.2f\n", num1, num2, num3, num4, num5, num6);
	}

}
