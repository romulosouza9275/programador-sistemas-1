package controller;
import java.util.Scanner;

public class ExemploScanner2 {
	  public static void main(String args[])
	  {
		  String nome;
		  System.out.println("Digite seu nome:");
		  Scanner sc = new Scanner(System.in);
		  nome = sc.nextLine();
		  System.out.println("Nome Digitado: " + nome.toUpperCase());		  
		  
		  
		  double salario;
		  System.out.println("Digite o Salário que deseja: ");
		  Scanner sc2 = new Scanner(System.in);
		  salario = sc2.nextDouble();
		  System.out.println("Salário Digitado: " + salario);		  
		  
		  sc.close();
		  sc2.close();
	  }
}
