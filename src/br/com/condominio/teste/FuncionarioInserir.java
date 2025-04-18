package br.com.condominio.teste;

import java.sql.Connection;

import br.com.condominio.conexao.Conexao;
import br.com.condominio.dao.FuncionarioDao;
import br.com.condominio.model.Funcionario;

public class FuncionarioInserir {

	public static void main(String[] args) {
		Connection con = Conexao.abrirConexao();
		
		Funcionario funcionario = new Funcionario();
		FuncionarioDao funcionarioDao = new FuncionarioDao(con);
		
		funcionario.setNome("Davi");
		funcionario.setIdade(17);
		funcionario.setSalario(6000);
		System.out.println(funcionarioDao.inserir(funcionario));
		
		Conexao.fecharConexao(con);
	}
	
}
