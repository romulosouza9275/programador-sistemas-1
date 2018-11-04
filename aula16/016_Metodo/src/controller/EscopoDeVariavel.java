package controller;

public class EscopoDeVariavel {
	static int x = 2; // variável global

	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA é " + x);
		x = x + 1;
		System.out.println("variável local x antes de sair do metodoA é " + x);
	}

	public static void metodoB() {
		System.out.println("Variável x ao entrar no metodoB é " + x + " global.");
		x = x * 10;
		System.out.println("Variável x antes de sair do metodoB é " + x);
	}
	
	public static void metodoB(double y)
	{
		//System.out.println("Eu");
		System.out.println("Variável x aoe ntrar no metodoB é "+ y + " global.");
		y = y*10;
		System.out.println("Variável x antes de sair do	metodoB é "+y);
	}
	
	
	public static int metodoB(int x)
	{
		System.out.println("Variável x aoe ntrar no metodoB é "+ x + " global.");
		x = x*10;
		System.out.println("Variável x antes de sair do	metodoB é "+x);
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//metodoA();
		//metodoB();
		int x = 5;
		x = x + 7;
		System.out.println("x no início de main() é " + x);
		//metodoA();
		//System.exit(1);
		//metodoB();
		System.out.println("=======================");
		x = metodoB(x);
		System.out.println(x);
		System.out.println("=======================");
		metodoB(2.00);
	}

}
