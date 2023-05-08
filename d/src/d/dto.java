package d;

public class dto {

	public String num;
	public int kor;
	public int eng;

	public int add() {
		int add = this.kor + this.eng;
		return add;
	}

	public float avg() {
		float avg = (float) this.add() / 3;
		return avg;

	}

}
