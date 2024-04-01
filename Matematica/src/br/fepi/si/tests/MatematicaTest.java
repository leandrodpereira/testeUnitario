package br.fepi.si.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.fepi.si.Matematica;

class MatematicaTest {
	
	Matematica matematica;
	
	@BeforeEach
	void setUp() throws Exception {
		matematica = new Matematica();
	}

	@Test
	void testIsPositivo() {
		assertTrue(matematica.isPositivo(-10.0));
	}	

}
