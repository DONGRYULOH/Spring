package DI_06_Spring;

public class ArticleService {
	
	//사용자의 요청에 따라서 DAO가 가지는 함수를 호출함 (CRUD)
	
	//글쓰기 서비스 
	
	//목록보기 서비스 
	
	//ArticleService 객체는 ArticleDao 객체에 의존한다
	private ArticleDao articledao;
	
	//articledao 들어오는 파라미터로 Oracle 또는 Mysql이 들어올수있다 즉 다형성을 고려한것 유연해짐 
	public ArticleService(ArticleDao articledao) {
		this.articledao = articledao; 
		System.out.println("ArticelService 생성자 호출");
	}
	
	//글쓰기 서비스 
	public void write(Article article) {
		this.articledao.insert(article); //DAO 객체의 insert 함수 호출 
	}
	
}
