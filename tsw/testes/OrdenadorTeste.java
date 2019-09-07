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
}
