package model.DAO;

import util.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import model.*;

public class ContatoDAO {

	public static Contato inserir(String nome, String email, String mensagem) {
		Contato contato = null;
		try {
			// Criação do insert
			String sql = "insert into contato (nome, email, mensagem) values (?,?,?)";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "jeffrey","password");			
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1, nome);
			comando.setString(2, email);
			comando.setString(3, mensagem);
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		contato = new Contato(nome, email, mensagem);
		return contato;
	}

	public static Contato[] buscarTodos() {
		Contato[] contatos = null;
		try {
			// Crição do select
			String sql = "Select * from contato";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "jeffrey","password");
			Connection con = conex.obterConexao();
			/*
			 * Executa a confirmação direta de acesso ao banco pois não são necessárias
			 * informações para a Query (caracter curinga)
			 */
			Statement comando = con.createStatement();
			/*
			 * ResultSet - Classe java que monta em memória uma matriz com a resposta das
			 * linhas do banco de dados
			 */
			ResultSet rs = comando.executeQuery(sql);
			// vetor de objetos
			contatos = new Contato[10];
			/*
			 * Passagem de linha de dados do ResultSet para o vetor de objetos (uma linha de
			 * dados da matriz do ResultSet é copiada para um objeto no vetor contatos)
			 */
			int i = 0;
			while (rs.next()) {
				contatos[i++] = new Contato(rs.getInt("id"), rs.getString("nome"), rs.getString("email"),
						rs.getString("mensagem"));
			}
			// É necessário encerrar o acesso ao banco para liberar a conexão
			rs.close();
			comando.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contatos;
	}
	
	public static Contato excluir(int id){
		Contato contato = null;
		try {
			// Criação do insert
			String sql = "delete from contato where id = ?";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.cj.jdbc.Driver", "jeffrey","password");
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setInt(1,id);
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return contato;
	}	
	
	
	public static Contato atualizar(String mensagem, int id){
		Contato contato = null;
		try {
			// Criação do insert
			String sql = "update contato set mensagem = ? where id = ? ";
			// Obter a conexão com o banco de dados
			Conexao conex = new Conexao("jdbc:mysql://localhost:3306/conexaobd?useTimezone=true&serverTimezone=UTC", "com.mysql.jdbc.Driver", "jeffrey","password");			
			// Abrir a conexão
			Connection con = conex.obterConexao();
			// Preparar o comando para ser executado
			PreparedStatement comando = con.prepareStatement(sql);
			comando.setString(1,mensagem);
			comando.setInt(2,id);
			// Comando executado
			comando.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return contato;
	}	
	
}
