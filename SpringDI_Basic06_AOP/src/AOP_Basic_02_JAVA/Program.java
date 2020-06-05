package AOP_Basic_02_JAVA;

import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class Program {

	public static void main(String[] args) {
		
		
		
		//자바 어노테이션을 사용한 클래스로부터 객체 설정 정보를 가져옴 
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigContext.class);
		
		
		
		
		
		
		
		Calc calc = new NewCalc();
		//calc 에는 실객체의 주소가 있음
		
		
		
		//위의 코드가 아니라 가짜를 통해서(프록시) 접근 하도록 .... 
		Calc cal = (Calc)Proxy.newProxyInstance(calc.getClass().getClassLoader() //실제 객체의 메타정보 
												,calc.getClass().getInterfaces() //행위정보(인터페이스의 정보)
												,new LogPrintHandler(calc)); //보조객체에 대한 정보 (실객체의 주소를 갖음)
		
		
		//코드를 직접 작업해서 프록시를 사용 
		//이걸 외부로 뺴버리면 사용자는 프록시인지 모르고 사용함
		
		int result = cal.ADD(555,555);
		System.out.println("Main result:"+result);
		

	}

}
