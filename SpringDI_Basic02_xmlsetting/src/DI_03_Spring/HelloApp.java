package DI_03_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//영문
		//MessageBean_en messagebean_en = new MessageBean_en();
		//messagebean_en.sayHello("hong");
		
		//한글
		//MessageBean_kr messagebean_kr = new MessageBean_kr();
		//messagebean_kr.sayHello("hong");
				
		//interface 하나의 참조 변수가 여러개의 주소를 가질 수 있다 (다형성)
		
		//MessageBean messagebean = new MessageBean_kr();
		
		//1.스프링 프레임웤 자원을 추가함(jar파일) - spring.core , spring.beans 등등 
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("DIConfig.xml"); 어제했던 컨테이너 생성방법 (타입변환이 안되는 컨테이너)
		ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_03_Spring/DI_03.xml");
		
		//2.컨테이너를 구성할 xml을 찾아서 들어감 classpath:DI_03_Spring/DI_03.xml
		// -> 컨테이너 안에서 DI_03_Spring.MessageBean_kr 객체가 생성됨 이 객체의 주소로 매핑된 ID 값을 얻어옴 
		
		MessageBean messagebean = context.getBean("message",MessageBean.class); // GenericXml 컨테이너로 구성해서 두번쨰 파리미터로 해당객체를 타입변환할수있음
		//3. DI_03_Spring.MessageBean_kr 이 객체의 주소로 매핑된 ID 값(message)를 얻어옴 
		
		messagebean.sayHello("hong");

	}

}
/*
요구사항
영문버전 (hong) : Hello hong !
한글버전 (hong) : 안녕 hong !

MessageBean_kr > 함수 > sayHello
MessageBean_en > 함수 > sayHello

>>인터페이스 :  MessageBean  인터페이스 설계 >> kr , en 구현
*/

