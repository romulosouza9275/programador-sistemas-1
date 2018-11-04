package controller;
import util.Teclado;
public class DesvioCondicionalEncadeado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sal, salNovo;
		sal = Teclado.lerDouble("Digite o Salário: ");
		if (sal < 500) {
			salNovo = sal * 1.15;
		} else {
			if (sal <= 1000) {
				salNovo = sal * 1.10;
			} else {
				salNovo = sal * 1.05;
			}
		}
		System.out.println("O Salário com reajuste é: " + salNovo);
	}

}
