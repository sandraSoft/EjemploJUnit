package inicial;

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
	 */
	public boolean retirar(double cantidad) {
		return false;
	}
}

