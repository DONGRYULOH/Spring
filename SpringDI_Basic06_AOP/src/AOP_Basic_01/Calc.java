package AOP_Basic_01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

/*
 간단한 사칙연산이 가능한 계산기 프로그램  
 -주관심(실제업무) : 사칙연산 (ADD , MUL) -> 이런 기능들을 구현
 -보조관심(공통관심) : 연산에 걸린 시간 
 -log 출력 (console 출력 Red로) 
 
 */


public class Calc {
	
	//주관심(더하는 기능)
	public int Add(int x,int y) {
		
		//보조업무 
		Log log = LogFactory.getLog(this.getClass());
		//System.currentTimeMillis()
		
		//스프링 프레임워크에서 제공하는 유틸 
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		
		
		int result = x + y; //주업무(핵심기능) 
		
		//보조업무 
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time Log Method:ADD]");
		log.info("[Time Log Method Time]"+sw.getTotalTimeMillis()); //걸린시간을 뽑아냄 
		
		return result;
	}
	
	//주관심(곱하는 기능)
	public int Mul(int x,int y) {
		
		//보조업무 
		Log log = LogFactory.getLog(this.getClass());
		//System.currentTimeMillis()
		
		//스프링 프레임워크에서 제공하는 유틸 
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("[타이머 시작]");
		
		int result = x * y; // 주업무(핵심)
		
		//보조업무 
		sw.stop();
		log.info("[타이머 종료]");
		log.info("[Time Log Method:Mul]");
		log.info("[Time Log Method Time]"+sw.getTotalTimeMillis()); //걸린시간을 뽑아냄 
				
				
				
		return result;
	}
	
	
	
}
