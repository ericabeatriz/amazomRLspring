package com.ifal.web.amazonRL.relatorio;

import java.util.List;

import com.ifal.web.amazonRL.modelo.Produto;

public class Relatorio {
	
	private Double maiorPreco = Double.NEGATIVE_INFINITY;
	private Double menorPreco = Double.POSITIVE_INFINITY;
	
	public Relatorio() {
		// TODO Auto-generated constructor stub
	}
	
	public void gerarRelatorioDePreco(List<Produto> produtos) {
		for (Produto produto : produtos) {
			if (produto.getPreco() > maiorPreco) {
				maiorPreco = produto.getPreco();
			} 
			
			if(produto.getPreco() < menorPreco) {
				menorPreco =produto.getPreco();
			}
		}	
	}
	
	public Double getMaiorPreco() {
		return maiorPreco;
	}

	public Double getMenorPreco() {
		return menorPreco;
	}
}
