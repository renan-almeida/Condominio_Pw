package br.com.condominio.teste;

import java.sql.Connection;

import br.com.condominio.conexao.Conexao;
import br.com.condominio.dao.FuncionarioDao;
import br.com.condominio.model.Funcionario;

public class FuncionarioDeletar {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		FuncionarioDao funcionarioDao = new FuncionarioDao(con);		
		
		System.out.println(funcionarioDao.deletar());
		
		Conexao.fecharConexao(con);
	}
	
}
