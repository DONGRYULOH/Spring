package DI_05_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//JAVA 코드
		
		/*
			MyBean mybean = new MyBean();
			MyBean mybean2 = new MyBean("hong");
			MyBean mybean3 = new MyBean();
			
			System.out.println("mybean:"+mybean);
			System.out.println("mybean2:"+mybean2);
			System.out.println("mybean3:"+mybean3);
			
			//싱글톤 으로 구현시 하나의 객체를 공유해서 사용 모두다 똑같은 주소값 참조 
			Singleton single = Singleton.getInstance();
			Singleton single2 = Singleton.getInstance();
			
			System.out.println("single:"+single);
			System.out.println("single2:"+single2);
		
		*/
		
		
		//MessageBeanImpl messagebean = new MessageBeanImpl("hong");
		//messagebean.setGreeting("hello");
		
		//messagebean.sayHello();
	
		// 위에 자바코드를 스프링으로 바꿀수 있음 스프링으로 할수 있는 모든건 자바코드로도 할수 있음 
		
		
		
		
		  ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_05_Spring/DI_05.xml"); 
		  //스프링 컨테이너 메모리가 구성되고 xml 파일을 read(파싱) 해서 객체를 생성하고 조립하고 소멸하는 역할 
		  //컨테이너 안에 있는 필요한 객체를 얻어서 사용하면됨 그때 사용하는함수 객체를 얻어서 사용하는 함수(getBean함수) 
		  
		  //getBean()_return 타입은 Object >> down캐스팅 해서 작업함 
		  
		  // ****** 주의 사항 getBean() 함수를 호출하면 새로운 객체를 만들지 않음 -> new 하지 않음 그냥컨테이너 않에서 끄집어옴 
		  //*** 스프링 컨테이너가 가지는 객체의 타입 : default 값 singleton 
		  //** 예외적으로 getBean() 할때 객체를 새로 생성할수 있는 방법도 있긴한데 거의 쓰지않음 
		  MyBean mybean = context.getBean("mybean",MyBean.class); 
		  MyBean mybean2 = context.getBean("mybean",MyBean.class); 
		  MyBean mybean3 = context.getBean("mybean",MyBean.class); 
		  
		  MyBean mybean4 = context.getBean("mybean2",MyBean.class); 
		
		  System.out.println("mybean 주소값:"+mybean);
		  System.out.println("mybean2 주소값:"+mybean2);
		  System.out.println("mybean3 주소값:"+mybean3);
		  
		  System.out.println("mybean4주소값:"+mybean4);
	}

}


