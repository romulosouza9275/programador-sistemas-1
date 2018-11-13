package controller;
import util.Teclado;
public class ComTratamentoDeErroTentativas {
	public static void main(String[] args) {
		int count = 0;
		int maxTries = 3;
		while (true) {
			try {
				double a = Teclado.lerDouble("Digite o Numerador:");
				double b = Teclado.lerDouble("Digite o Denominador:");
				double c = a / b;
				System.out.println("Resultado da divisão de a por b:" + c);
				System.exit(0);
			} catch (NumberFormatException nfe) {
				System.out.println("Caracter Invalido!");
				if (++count == maxTries)
				{
					//throw nfe;
					System.out.println("Numero de tentativas excedido");
					System.exit(1);
				}
				else
				{
					continue;
				}
			} 
		}
	}
}
