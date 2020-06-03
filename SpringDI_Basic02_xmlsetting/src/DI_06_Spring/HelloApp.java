package DI_06_Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		//insert 작업 
		
		//Oracle 사용해서 쓴다고 가정시 
		//OracleArticleDao articledao = new OracleArticleDao();
//		ArticleService articleservice = new ArticleService(new OracleArticleDao());
//		
//		Article article = new Article();
//		articleservice.write(article);
//		
//		
//		//Mysql 사용해서 쓴다고 가정시 
//		MySqlArticleDao articledao1 = new MySqlArticleDao();
//		ArticleService articleservice1 = new ArticleService(articledao1);
//		
//		Article article1 = new Article();
//		articleservice1.write(article1);
		
		// 위에 코드를 자바말고 스프링을 이용해서 바꾼 코드 
		
		 ApplicationContext context = new GenericXmlApplicationContext("classpath:DI_06_Spring/DI_06.xml");
		 
		 //OracleArticleDao oracle_dao = context.getBean("oracle_dao",OracleArticleDao.class);
		 //MySqlArticleDao mysql_dao = context.getBean("mysql_dao",MySqlArticleDao.class);
		 
		 ArticleService articleservice = context.getBean("article_service",ArticleService.class);
		 
		 Article article = context.getBean("article",Article.class);
		 
		 articleservice.write(article); 
		 //행위자체 따로 xml 에서 조립하지 않음
		 //setter,getter 함수를 제외한 나머지 함수는 자바코드에서 작성?? 
		

	}
}



















