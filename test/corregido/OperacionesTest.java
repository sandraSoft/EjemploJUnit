package corregido;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class OperacionesTest {

	/**
	 * Dividir dos enteros positivos, con resultado un double
	 */
	@Test
	void testDividirPositivos() throws Exception {
		Operaciones operar = new Operaciones();
		double resultadoEsperado = 5;
		double resultado = operar.dividir(10, 2);
		assertEquals(resultadoEsperado,resultado);
	}

	/**
	 * Probar una división por cero,
	 * que debería lanzar una excepción
	 */
	@Test
	void testDividirPorCero() {
		Operaciones operar = new Operaciones();
		assertThrows(Exception.class,
				()->operar.dividir(500,0));
	}
}
