package DI2;

public class NewRecordView {
	
	//점수 출력하는 클래스 
	private NewRecord record; //member field(setter 생성)
	
	
	//1.[생성자]를 통해서 필요한 객체를 생성 또는 주입 >> DI패키지에서 >> 합성(복합)연관
	//2.함수(setter)를 통해서 필요한 객체를 주입받을수 있음 >> DI2 패키지에서 >> 집합연관 
	// 의무냐 선택이냐의 차이점 --> 둘중 상황에따라서씀 
	
	
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
	}

	//record의 setter 함수 
	public void setRecord(NewRecord record) {
		//함수의 parameter를 통해서 NewRecord 객체의 주소값 
		this.record = record;
	}
	
}
