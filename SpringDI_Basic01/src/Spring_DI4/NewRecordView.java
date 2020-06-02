package Spring_DI4;

import java.util.Scanner;

public class NewRecordView implements RecordView{
	
	
	//점수 출력하는 클래스 
	private NewRecord record; //member field(setter 생성)
	
	
	//1.[생성자]를 통해서 필요한 객체를 생성 또는 주입 >> DI패키지에서 >> 합성(복합)연관
	//2.함수(setter)를 통해서 필요한 객체를 주입받을수 있음 >> DI2 패키지에서 >> 집합연관 
	// 의무냐 선택이냐의 차이점 --> 둘중 상황에따라서씀 
	//3.인터페이스를 활용(다형성) 
	
	
	@Override
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("kor:");
		record.setKor(sc.nextInt());
		
		System.out.println("eng:");
		record.setEng(sc.nextInt());
		
		System.out.println("Math:");
		record.setMath(sc.nextInt());
	}

	//record의 setter 함수 
	public void setRecord(Record record) { //parameter type : interface 
		//함수의 parameter를 통해서 NewRecord 객체의 주소값 
		this.record = (NewRecord)record;
	}
	
}
