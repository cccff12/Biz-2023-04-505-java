package method;

import com.callor.score.oneday;

import scoreDto.ScoreDto;

public class servicea {

	
	public int korall;
	public int engall;
	public int mathall;
	public int musicall;
	public int artall;
	
	
	
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

	
	
	
	
	
}
	
	
	
	

