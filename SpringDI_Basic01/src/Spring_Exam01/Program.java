package Spring_Exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//xml 파일로 객체를 생성해서 사용하는게 아니라 자바클래스의 어노테이션을 사용한 객체를 쓰겠다 
		ApplicationContext context = new AnnotationConfigApplicationContext(DIconfig.class);
		
		Exam exam = context.getBean("exam",Exam.class);
		
		exam.print();
		
		//위의 코드를 XML 파일로 객체를 생성한다면 
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring_Exam01/DI_01.xml");
//		
//		DIconfig a = context.getBean("exam",DIconfig.class);
//		
//		Exam b = a.exam();
//		b.print();
	}

}
