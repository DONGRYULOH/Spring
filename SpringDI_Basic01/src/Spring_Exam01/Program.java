package Spring_Exam01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		//xml ���Ϸ� ��ü�� �����ؼ� ����ϴ°� �ƴ϶� �ڹ�Ŭ������ ������̼��� ����� ��ü�� ���ڴ� 
		ApplicationContext context = new AnnotationConfigApplicationContext(DIconfig.class);
		
		Exam exam = context.getBean("exam",Exam.class);
		
		exam.print();
		
		//���� �ڵ带 XML ���Ϸ� ��ü�� �����Ѵٸ� 
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:Spring_Exam01/DI_01.xml");
//		
//		DIconfig a = context.getBean("exam",DIconfig.class);
//		
//		Exam b = a.exam();
//		b.print();
	}

}
