package DI2;

public class NewRecordView {
	
	//���� ����ϴ� Ŭ���� 
	private NewRecord record; //member field(setter ����)
	
	
	//1.[������]�� ���ؼ� �ʿ��� ��ü�� ���� �Ǵ� ���� >> DI��Ű������ >> �ռ�(����)����
	//2.�Լ�(setter)�� ���ؼ� �ʿ��� ��ü�� ���Թ����� ���� >> DI2 ��Ű������ >> ���տ��� 
	// �ǹ��� �����̳��� ������ --> ���� ��Ȳ�����󼭾� 
	
	
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
	}

	//record�� setter �Լ� 
	public void setRecord(NewRecord record) {
		//�Լ��� parameter�� ���ؼ� NewRecord ��ü�� �ּҰ� 
		this.record = record;
	}
	
}
