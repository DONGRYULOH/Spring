package DI_08_Spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		/*
		JobExecute jobexecute = new JobExecute("hong", 100);
		
		//JobExecute jobexecute2 = new JobExecute("hong", 100L);
		
		//JobExecute jobexecute3 = new JobExecute("hong", "kim");
		
		ArticleDao articledao = new ArticleDao();
		jobexecute.setArticledao(articledao); //setter 참조값
		
		jobexecute.setData(500); //setter 주입 값
		*/
		
		
		ApplicationContext context = 
				new GenericXmlApplicationContext("classpath:DI_08_Spring/DI_08.xml");
	
		
		
	}

}


