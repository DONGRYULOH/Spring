package DI2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView();
		//�ʿ��ϴٸ� .... NewRecord ��ü 
		
		//set�� ���ؼ� record�� �����Ҽ� �ִ�
		NewRecord record = new NewRecord(100,50,50);
		view.setRecord(record);
		
//		
//		view.print();
		
	
		
		
		
	}

}
