package Spring_Exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIconfig_2 {

	@Bean
	public Exam exam2() {
		System.out.println("exam2 �Լ� ����!");
		return new Exam();
	}
}
