package testes;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import negocio.IOrdenador;
import negocio.Ordenador;

class OrdenadorTeste {
	
	IOrdenador ordenador; 

	@BeforeEach
	void setUp() throws Exception {
		ordenador = new Ordenador();
		((Ordenador) ordenador).limpaArray();
	}

	@Test
	void insereColecaoSucesso() {
		
		// Criando lista e setando valores 
		ArrayList<String> numeros = new ArrayList<String>();
		
		numeros.add("2.0");
		numeros.add("6.5"); 
		numeros.add("9.0");
		numeros.add("7.5"); 
		numeros.add("1.1");
		numeros.add("0.5"); 
		
		// insere coleção 
		
		ordenador.inserirColecao(numeros);
		
		 assertEquals(6, ((Ordenador) ordenador).getTamanhoLista());
	}
	
	@Test
	void insereColecaoFalha() {
		
		// Criando lista e setando valores 
		ArrayList<String> numeros = new ArrayList<String>();
		
		numeros.add("2.0");
		numeros.add("6.5"); 
		numeros.add("9.0");
		numeros.add("7.5"); 
		numeros.add("1.1");
		numeros.add("0.5"); 
		
		// insere coleção 
		
		ordenador.inserirColecao(numeros);
		
		 assertNotSame(7, ((Ordenador) ordenador).getTamanhoLista());
	}
	
	@Test
	void insereColecaoNulaExcecao() {
		
		// Criando lista e setando valores 
		ArrayList<String> numeros = null;
		
		
		
		
		// insere coleção 
		
		
		assertThrows(NullPointerException.class, () -> {
			ordenador.inserirColecao(numeros); 
		    });
	}
	
	
	
	@Test
	void insereColecaoNul() {
		
		// Criando lista e setando valores 
		ArrayList<String> numeros = null;
		
		
		
		ordenador.inserirColecao(numeros); 	
		   
	}
	
	@Test
	void testaMaiorNumeroInsereColecao() {
		
		// Criando lista e setando valores 
		ArrayList<String> numeros = new ArrayList<String>();
				
		numeros.add("0.3");
		numeros.add("0.5"); 
		numeros.add("0.0");
		numeros.add("0.5"); 
		numeros.add("0.3");
		numeros.add("0.4"); 
		numeros.add("0.4"); 
			
		// insere coleção 	
			
		ordenador.inserirColecao(numeros); 	
		
		assertEquals(0.5, ordenador.getMaiorValor());
			
		
	}
	
	
	
	@Test
	void testaInsereValorSucesso() {
		
		// Insere Valor
		ordenador.informarValor("7.5");
		
		assertEquals(7.5, ordenador.getMaiorValor());
			
		
	}
	
	@Test
	void testaInsereValorCaracetere() {
		
		// Insere Valor
		ordenador.informarValor("AAAA");
		
		assertSame("AAAA", ordenador.getMaiorValor());
			
		
	}
	
	@Test
	void testaInsereValorCaracetereExececao() {
		
		// Insere Valor
		
		
		assertThrows(NumberFormatException.class, () -> {
			ordenador.informarValor("AAAA");
		    });
			
		
	}
	
	@Test
	void testaInsereValorNulo() {
		
		// Insere Valor
		
		String numero = null; 
		
		ordenador.informarValor(numero);
			
		
	}
	
	
	@Test 
	void testaMaiorValorSucesso() {
		
		// Insere Valor
		
		ordenador.informarValor("7.5");
		ordenador.informarValor("8.5");
		ordenador.informarValor("2.5");
		
		assertEquals(8.5, ordenador.getMaiorValor());
		
		
	}
	
	@Test 
	void testaMenorValorSucesso() {
		
		// Insere Valor
		
		ordenador.informarValor("7.5");
		ordenador.informarValor("8.5");
		ordenador.informarValor("2.5");
		
		assertEquals(2.5, ordenador.getMenorValor());
		
		
	}
	
	@Test 
	void testaMenorValorFalha() {
		
		// Insere Valor
		
		ordenador.informarValor("7.5");
		ordenador.informarValor("2.5");
		ordenador.informarValor("8.5");
		
		
		assertEquals(7.5, ordenador.getMenorValor());
		
		
	}
	
	
	@Test
	void testaValorMedioListaSucesso() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("4.0");
				numeros.add("9.0"); 
				numeros.add("20.0");
				numeros.add("10.0"); 
				numeros.add("9.0");
				numeros.add("8.0"); 
				numeros.add("9.0"); 
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(9.857142857142858, ordenador.getValorMedio());
		
	}
	
	
	@Test
	void testaValorMedioSucesso() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("7.0");
				numeros.add("-4.0"); 
				numeros.add("0.0");
				numeros.add("5.0"); 
				numeros.add("-7.0");
				numeros.add("8.0"); 
				numeros.add("0.0"); 
				numeros.add("-1.0");
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(1.0, ordenador.getValorMedio());
		
	}
	
	
	@Test
	void testaValorMedioSucessoValorNegativo() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("-7.0");
				numeros.add("-4.0"); 
				numeros.add("0.0");
				numeros.add("-5.0"); 
				numeros.add("-7.0");
				numeros.add("-8.0"); 
				numeros.add("0.0"); 
				numeros.add("-1.0");
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(-4.0, ordenador.getValorMedio());
		
	}
	
	
	@Test
	void testaMedianaPar() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("-7.0");
				numeros.add("-4.0"); 
				numeros.add("0.0");
				numeros.add("-5.0"); 
				numeros.add("-7.0");
				numeros.add("-8.0"); 
				numeros.add("0.0"); 
				numeros.add("-1.0");
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(-6.0, ordenador.getValorMediana());
		
	}
	
	@Test
	void testaMedianaImparUmNumero() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("2.0");
				
				
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(2.0, ordenador.getValorMediana());
		
	}
	
	@Test
	void testaMedianaImpar() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = new ArrayList<String>();
						
				numeros.add("2.0");
				numeros.add("5.0"); 
				numeros.add("6.0");
				numeros.add("9.0"); 
				numeros.add("-8.0"); 
				numeros.add("0.0"); 
				numeros.add("-1.0");
					
				// insere coleção 	
					
				ordenador.inserirColecao(numeros); 	
				
				
				assertEquals(9.0, ordenador.getValorMediana());
		
	}
	
	@Test
	void testaMedianaNull() {
		
		// Criando lista e setando valores 
				ArrayList<String> numeros = null;
						
				
					
				// insere coleção 	
					
				
				
				
				assertThrows(NullPointerException.class, () -> {
					ordenador.inserirColecao(numeros); 	
				    });
		
	}
	
	@Test
	void testaMedianaVazio() {
				
				
				
				assertThrows(IndexOutOfBoundsException.class, () -> {
					assertEquals(9.0, ordenador.getValorMediana());	
				    });
		
	}
	
}
