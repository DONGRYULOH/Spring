package AOP_Basic_02_JAVA;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
	보조업무(공통관심) 별도의 클래스 분리 
	invoke : 하나의 함수가 여러개의 함수를 대리처리.. (대리함수)
 */

public class LogPrintHandler implements InvocationHandler{

	private Object target; //실객체의 주소값을 받아내는 변수
	
	public LogPrintHandler(Object target) {
		System.out.println("LogPrintHandler 생성자 호출");
		this.target = target;
	}
	
	
	
	//주업무가 가지는 함수
	//ADD , MUL , SUB 함수들을 대리해서 처리함
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Invoke 함수 호출");
		System.out.println("method 함수명:"+method);
		System.out.println("method Prarmeter:"+Arrays.toString(args));
		
		//보조업무 
		Log log = LogFactory.getLog(this.getClass());
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		
		//주업무 (실객체의 함수를 호출) ADD , MUL , SUB 함수들을 호출함 (Invoke가 리턴하는것 Object)
		int result = (int)method.invoke(this.target,args);
		
		
		
		//보조업무 
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time Log Method:ADD]");
		log.info("[Time Log Method Time]"+sw.getTotalTimeMillis()); //걸린시간을 뽑아냄 
		
		return result;
	}

}
