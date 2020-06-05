package Spring_Exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIconfig {

	@Bean // 이 함수가 리턴하는 객체를 스프링 컨테이너 안에넣어줌 
	public Exam exam() {
		System.out.println("exam 함수 실행!");
		return new Exam();
	}
}
