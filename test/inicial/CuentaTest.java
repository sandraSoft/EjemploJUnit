package inicial;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CuentaTest {

	/**
	 * Probar un retiro normal de una cuenta: retirar menos del saldo.
	 * Debe dejar retirar y modificar el saldo (restando la cantidad retirada)
	 * 
	 *--
	 * SE USA: AsserAll para agrupar los assert relacionados
	 */
	@Test
	public void testRetirarMenosDelSaldo() {
		Cuenta cuenta = new Cuenta(350000);
		double saldoEsperado = 250000;
		boolean retiro = cuenta.retirar(100000);
		double saldoReal = cuenta.getSaldo();
		assertAll("retiro Normal", 
				() -> assertTrue(retiro), 
				() -> assertEquals(saldoEsperado, saldoReal));
	}
	
	/**
	 * Probar un retiro normal de una cuenta: retirar menos del saldo.
	 * Debe dejar retirar y modificar el saldo (restando la cantidad retirada)
	 * 
	 * --
	 * OTRA ALTERNATIVA: Tener asserts separados
	 */
	@Test
	public void testRetirarMenosDelSaldo2() {
		Cuenta cuenta = new Cuenta(350000);
		double saldoEsperado = 250000;
		boolean retiro = cuenta.retirar(100000);
		double saldoReal = cuenta.getSaldo();
		assertTrue(retiro); 
		assertEquals(saldoEsperado, saldoReal);
	}
	
	
}
