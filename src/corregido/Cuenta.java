package corregido;

/**
 * Una cuenta bancaria con dinero.
 * Se modifica el saldo con transacciones como retirar.
 * @version 1.0
 */
public class Cuenta {

	private double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	/**
	 * Retira dinero de la cuenta, si hay saldo suficiente 
	 * @param cantidad la cantidad de dinero que se desea sacar
	 * @return si se pudo retirar o no (porque se contaba con saldo)
	 * @throws Exception si se recibe una cantidad negativa
	 */
	public boolean retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar un valor negativo");
		}
		
		if (cantidad <= saldo) {
			saldo = saldo - cantidad;
			return true;
		}
		else {
			return false;
		}
	}
}
