package Spring_DI4;

import java.util.Scanner;

public class NewRecordView implements RecordView{
	
	
	//���� ����ϴ� Ŭ���� 
	private NewRecord record; //member field(setter ����)
	
	
	//1.[������]�� ���ؼ� �ʿ��� ��ü�� ���� �Ǵ� ���� >> DI��Ű������ >> �ռ�(����)����
	//2.�Լ�(setter)�� ���ؼ� �ʿ��� ��ü�� ���Թ����� ���� >> DI2 ��Ű������ >> ���տ��� 
	// �ǹ��� �����̳��� ������ --> ���� ��Ȳ�����󼭾� 
	//3.�������̽��� Ȱ��(������) 
	
	
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

	//record�� setter �Լ� 
	public void setRecord(Record record) { //parameter type : interface 
		//�Լ��� parameter�� ���ؼ� NewRecord ��ü�� �ּҰ� 
		this.record = (NewRecord)record;
	}
	
}
