package DI;

public class NewRecordView {
	
	//���� ����ϴ� Ŭ���� 
	private NewRecord record;
	
	public NewRecordView(int kor,int eng,int math) {
		record = new NewRecord(kor,eng,math);
		//NewRecordView ��������� NewRecord�� ������� (���� ��...�ռ����� ���� ����������Ŭ�� ������) 
	}
	
	public void print() {
		System.out.println(record.total()+"/"+record.avg());
	}
	
}