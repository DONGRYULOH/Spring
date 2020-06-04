package DI_Annotation_05;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//만약 context.xml 파일이 있다면 
//<bean id="user" class="DI_Annotation_05.User">
//<bean id="user" class="DI_Annotation_05.User2"> 

//@Bean 어노테이션 사용해서 객체를 리턴 



@Configuration //ConfigContext 자바 파일은 xml 대체 할수 있다(객체 생성 조립)  -> 자바파일로도 xml 처럼 사용할수 있다 
public class ConfigContext {
	//<bean id="user" class="DI_Annotation_05.User">
	
	@Bean
	public User user() {
		return new User();
	} 
	
	@Bean
	public User2 user2() {
		return new User2();
	}
	
}
