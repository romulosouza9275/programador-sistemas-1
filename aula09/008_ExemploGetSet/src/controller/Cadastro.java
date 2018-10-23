package controller;
import model.Pessoa;
public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa people = new Pessoa();
		people.setNome("Carlos Teles");
		people.setIdade(38);
		people.setSexo("Masculino");
		
		System.out.println("Nome: "+ people.getNome());
		System.out.println("Idade: "+ people.getIdade());
		System.out.println("Sexo: "+ people.getSexo());
		
		
		
		Pessoa people1 = new Pessoa();
		people1.setNome("Maria Antonia");
		people1.setIdade(4);
		people1.setSexo("Feminino");
		
		System.out.println("Nome: "+ people1.getNome());
		System.out.println("Idade: "+ people1.getIdade());
		System.out.println("Sexo: "+ people1.getSexo());		
		
	}

}
