package corregido;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTestConBefore {

	private Cuenta cuenta;
	
	@BeforeEach
	void configurar() {
		cuenta = new Cuenta(350000);
	}
	
	/**
	 * Probar un retiro normal de una cuenta: retirar menos del saldo.
	 * Debe dejar retirar y modificar el saldo (restando la cantidad retirada) 
	 */
	@Test
	public void testRetirarMenosDelSaldo() throws Exception {
		double saldoEsperado = 250000;
		boolean retiro = cuenta.retirar(100000);
		double saldoReal = cuenta.getSaldo();
		assertAll("retiro normal", 
				() -> assertTrue(retiro), 
				() -> assertEquals(saldoEsperado, saldoReal));
	}

	/**
	 * Probar un retiro de una cantidad mayor al saldo
	 * No debe dejar retirar y tampoco debe modificar el saldo 
	 */
	@Test
	public void testRetirarMasDelSaldo() throws Exception {
		double saldoEsperado = 350000;
		boolean retiro = cuenta.retirar(400000);
		double saldoReal = cuenta.getSaldo();
		assertAll("retiro fallido por saldo", 
				() -> assertFalse(retiro), 
				() -> assertEquals(saldoEsperado, saldoReal));
	}
	
	/**
	 * Probar un retiro de una cantidad negativa
	 * Debe lanzar una excepción y no debe modificar el saldo 
	 */
	@Test
	public void testRetirarValorNegativo() {
		double saldoEsperado = 350000;
		assertAll("retiro con excepción", 
				() -> assertThrows(Exception.class, ()-> cuenta.retirar(-200000)), 
				() -> assertEquals(saldoEsperado, cuenta.getSaldo()));
	}
}
