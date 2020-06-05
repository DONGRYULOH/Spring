package AOP_Basic_01;

public class Program {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		int result = calc.Add(1000000,100000000);
		
		System.out.println("ADD RESULT:"+result);
		
		result = calc.Mul(10022000,1200000);
		System.out.println("MUL RESULT:"+result);

	}

}
 