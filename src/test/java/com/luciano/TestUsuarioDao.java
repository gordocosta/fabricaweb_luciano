package com.luciano;

import com.luciano.entidade.Usuario;
import com.luciano.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDao {

	public static void main(String[] args) {
	
	testExcluir();
		
	}
	
	public static void testExcluir(){
		Usuario usu = new Usuario();
		usu.setId(3);
		
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.excluir(usu);
		
		System.out.println("Cadastrado com sucesso!");
		
	}
	
	public static void Testalterar(){
		Usuario usu = new Usuario();
		usu.setId(1);
		usu.setNome("Jo�ozao da silva");
		usu.setLogin("jjrapaz");
		usu.setSenha("123");
		
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.alterar(usu);
		
		System.out.println("Cadastrado com sucesso!");
	}
	
	public static void testCadastrar(){
		Usuario usu = new Usuario();
		usu.setNome("Jo�ozao");
		usu.setLogin("jjrapaz");
		usu.setSenha("123");
		
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com sucesso!");
		
	}

}
