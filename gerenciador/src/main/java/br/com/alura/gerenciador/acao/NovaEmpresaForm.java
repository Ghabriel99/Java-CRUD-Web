package br.com.alura.gerenciador.acao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresaForm implements Acao{

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException{
		
		System.out.println("Cadastrando uma nova empresa!");
		
		return "forward:formNovaEmpresa.jsp";
		
	}
}