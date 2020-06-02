package Spring_DI4;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
//		NewRecordView view = new NewRecordView();
//		NewRecord record = new NewRecord();
//		
//		view.setRecord(record); 
//		view.input();
//		view.print();
//		
		
		//����ó�� ��ü�� ���� ������� �ʰ� ������ �����ӿ�ũ�� �ذ� 
		
		// 1. ������ �����ӿ�ũ�� �����ϴ� �����̳� ���� (�޸� ���� : IOC �����̳� )
		// 2. �����̳� ����� �� �޸𸮿� �ʿ��� ��ü�� �ְ� �����ϴ� �۾� >> XML ���Ϸ� ������ 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		// �� ������ �ڵ�  : �����̳� ����� xml ������ read�ϰ� �����̳ʿ��ٰ� ��ü�� �����ϰ� ������ 
		
		// ���� �ڽ� ���� ���� ���� ������� 
		// �ʿ��ϸ� �ڽ����� ������� ������ͼ� �����ϸ�� 
	
		RecordView view = (RecordView)context.getBean("view");
		view.input();
		view.print();
		
		//Caused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory
		// ������ �����ӿ�ũ >> ������ jar ���ϵ��� �ٸ� Ŭ������ ���� ... 
		
		
	}

}
