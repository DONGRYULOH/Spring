package DI_07_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {

		
		 
		 
		/*
		ProtoclHandler handler = new ProtoclHandler();
		
		List<MyFilter> list = new ArrayList<MyFilter>();
		list.add(new EncFilter());
		list.add(new HeaderFilter());
		list.add(new ZipFilter());
		
		handler.setFilter(list); //List<MyFilter> 주소를 주입
		
		System.out.println(handler.filter_length());
		
		 */
		
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_07_Spring/DI_07.xml");
		
		ProtoclHandler handler = context.getBean("protocolHandler",ProtoclHandler.class);
		
		System.out.println(handler.filter_length());
	
		
	}
}



















