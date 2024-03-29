package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("urlPatterns =/entrada")
public class MonitoramentoFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Monitoramento Filter");
		
		long antes = System.currentTimeMillis();
		
		request.getParameter("acao");
		
		String acao = request.getParameter("acao");
		
		//executa a acao
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("tempo de execucao: " + acao + " ->" + (depois - antes));
		
	}

}
