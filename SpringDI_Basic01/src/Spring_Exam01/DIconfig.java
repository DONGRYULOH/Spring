package Spring_Exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIconfig {

	@Bean // �� �Լ��� �����ϴ� ��ü�� ������ �����̳� �ȿ��־��� 
	public Exam exam() {
		System.out.println("exam �Լ� ����!");
		return new Exam();
	}
}
