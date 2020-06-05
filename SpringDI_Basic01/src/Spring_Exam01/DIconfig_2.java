package Spring_Exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIconfig_2 {

	@Bean
	public Exam exam2() {
		System.out.println("exam2 함수 실행!");
		return new Exam();
	}
}
