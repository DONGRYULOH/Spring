package DI;

public class NewRecordView {
	
	//점수 출력하는 클래스 
	private NewRecord record;
	
	public NewRecordView(int kor,int eng,int math) {
		record = new NewRecord(kor,eng,math);
		//NewRecordView 만들어지면 NewRecord도 만들어짐 (복합 즉...합성관계 같은 라이프사이클을 공유함) 
	}
	
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
	}
	
}
