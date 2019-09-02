package testes;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import negocio.IOrdenador;
import negocio.Ordenador;

class OrdenadorTeste {
	
	IOrdenador ordenador; 

	@BeforeEach
	void setUp() throws Exception {
		ordenador = new Ordenador();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@AfterEach
	void limpa() {
		((Ordenador) ordenador).limpaArray();
	}

}
