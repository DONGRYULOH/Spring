package DI2;

//vo,dto,domain 의미를 갖는 클래스(데이터를 담을 수 있는 클래스)
public class NewRecord {
	private int kor;
	private int eng;
	private int math;
	
	public NewRecord() {}

	public NewRecord(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//필요에 따라서 추가 함수의 구현 가능 
	public int total() {
		return this.kor + this.eng + this.math;
	}
	
	// 평균 구하는 함수 
	public float avg() {
		return total() / 3.0f;
	}
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
}
