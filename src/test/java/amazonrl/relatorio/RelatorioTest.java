package amazonrl.relatorio;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.ifal.web.amazonRL.modelo.Produto;
import com.ifal.web.amazonRL.relatorio.Relatorio;




public class RelatorioTest {
   
	@Test
	public void deveEncontrarOMaiorPrecoDosProdutosEmOrdemCrescente() {
		
		Produto celular = new Produto("Sansung G0", 250.0);
		Produto tv = new Produto("LG HD", 300.0);
		Produto dvd = new Produto  ("Galinha Printadinha V.10", 400.0);
		
		List<Produto> produtos = new ArrayList();
		
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Double maiorPrecoEsperado = 400.0;
		Double menorPrecoEsperado = 250.0;
		
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
	   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
	   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
		
		
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoDosProdutosEmOrdemDecrescente() {
		

		Produto celular = new Produto("Sansung G0", 500.0);
		Produto tv = new Produto("LG HD", 350.0);
		Produto dvd = new Produto  ("Galinha Printadinha V.10", 250.0);
		
		List<Produto> produtos = new ArrayList();
		
		produtos.add(celular);
		produtos.add(tv);
		produtos.add(dvd);
		
		Double menorPrecoEsperado = 250.0;
		Double maiorPrecoEsperado = 500.0;
		
		
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
	   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
       assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
	  
		
		
	}
	
	@Test
	public void  deveEncontrarOMaiorPrecoDosProdutosEmOrdemAleatorio() {
		
		Produto dvd = new Produto  ("Galinha Printadinha V.10", 400.0);
		Produto tv = new Produto("LG HD", 500.0);
		Produto celular = new Produto("Sansung G0", 250.0);
	
		
		
		List<Produto> produtos = new ArrayList();
		
		produtos.add(dvd);
		produtos.add(tv);
		produtos.add(celular);
	
		
		
		Double maiorPrecoEsperado = 500.0;
		Double menorPrecoEsperado = 250.0;
		
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
	   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
	   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
		
		
	}
	
	@Test
	public void deveEncontrarOMaiorPrecoDosProdutosEmOrdemUnicoProduto() {
		
		
		Produto celular = new Produto("Sansung G0", 250.0);
	
		
		
		List<Produto> produtos = new ArrayList();
		produtos.add(celular);
	
		
		
		Double maiorPrecoEsperado = 250.0;
		Double menorPrecoEsperado = 250.0;
		
		
		
		Relatorio relatorio = new Relatorio();
		relatorio.gerarRelatorioDePreco(produtos);
		
	   assertEquals(maiorPrecoEsperado, relatorio.getMaiorPreco());
	   assertEquals(menorPrecoEsperado, relatorio.getMenorPreco());
	}
	
	
}

