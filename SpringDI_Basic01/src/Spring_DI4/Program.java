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
		
		//위에처럼 객체를 만들어서 사용하지 않고 스프링 프레임워크로 해결 
		
		// 1. 스프링 프레임워크가 제공하는 컨테이너 생성 (메모리 생성 : IOC 컨테이너 )
		// 2. 컨테이너 만들고 그 메모리에 필요한 객체를 넣고 조립하는 작업 >> XML 파일로 구성함 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml");
		// 이 한줄의 코드  : 컨테이너 만들고 xml 파일을 read하고 컨테이너에다가 객체를 생성하고 조립함 
		
		// 레고 박스 생성 레고 블럭이 만들어짐 
		// 필요하면 박스에서 레고블럭을 가지고와서 조립하면됨 
	
		RecordView view = (RecordView)context.getBean("view");
		view.input();
		view.print();
		
		//Caused by: java.lang.ClassNotFoundException: org.apache.commons.logging.LogFactory
		// 스프링 프레임워크 >> 수많은 jar 파일들이 다른 클래스를 의존 ... 
		
		
	}

}
