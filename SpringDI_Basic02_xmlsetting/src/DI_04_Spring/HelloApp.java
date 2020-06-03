package DI_04_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//JAVA 코드
		//MessageBeanImpl messagebean = new MessageBeanImpl("hong");
		//messagebean.setGreeting("hello");
		
		//messagebean.sayHello();
	
		// 위에 자바코드를 스프링으로 바꿀수 있음 스프링으로 할수 있는 모든건 자바코드로도 할수 있음 
		
		  ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_04_Spring/DI_04.xml"); 
		  MessageBean  messagebean = context.getBean("m1",MessageBean.class);
		  messagebean.sayHello();
		 

	}

}


