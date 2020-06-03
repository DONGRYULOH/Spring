package DI_06_Spring;

public class MySqlArticleDao implements ArticleDao{

	@Override
	public void insert(Article article) {
		System.out.println("Mysql insert 구문 실행");
	}
}
