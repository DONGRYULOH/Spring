package AOP_Basic_02_JAVA;

public class NewCalc implements Calc{

	@Override
	public int ADD(int x,int y) {
		//보조업무(공통업무) cross-cutting-concern
		int sum = x + y; //주업무  core-concern
		
		
		
		
		return sum;
	}
	
	@Override
	public int MUL(int x,int y) {
		//보조업무(공통업무) cross-cutt  ing-concern
		int mul = x * y; //주업무  core-concern
		
		return mul;
	}
	
	@Override
	public int SUB(int x,int y) {
		//보조업무(공통업무) cross-cutting-concern
		int sub = x - y; //주업무  core-concern
		
		return sub;
	}
	
}
