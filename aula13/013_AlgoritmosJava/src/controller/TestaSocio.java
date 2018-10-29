package controller;

public class TestaSocio {
	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 5; i++) {
			int random = (int) (Math.random() * 1000 + 1);
			int varret = TesteMes(random);
			System.out.println("Informe a matrícula:" + random);
			System.out.println("O mês de pagamento é:" + varret+"\n");
		}
	}
	public static int TesteMes(int matricula) {
		int numFinal;
		int valormes;
		numFinal = matricula % 10;
		switch (numFinal) {
		case 0:
			valormes = 1;
			break;
		case 1:
			valormes = 2;
			break;
		case 2:
			valormes = 3;
			break;
		case 3:
			valormes = 4;
			break;
		case 4:
			valormes = 5;
			break;
		default:
			valormes = 6;
		}
		return valormes;
	}

}
