package scoreDto;

public class ScoreDto {

	public String num;

	public int kor;
	public int eng;
	public int math;
	public int music;
	public int art;

	public int total() {
		int total = this.kor + this.eng + this.math + this.music + this.art;
		return total;

	}
	
	
	
	public float avg() {
		float avg = (float)this.total() / 5;
		return avg;

	}


	
	
	
}
