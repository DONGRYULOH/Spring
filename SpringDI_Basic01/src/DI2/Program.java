package DI2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		NewRecordView view = new NewRecordView();
		//필요하다면 .... NewRecord 객체 
		
		//set를 통해서 record를 주입할수 있다
		NewRecord record = new NewRecord(100,50,50);
		view.setRecord(record);
		
//		
//		view.print();
		
	
		
		
		
	}

}
