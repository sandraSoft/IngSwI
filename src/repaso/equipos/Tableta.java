package repaso.equipos;

/**
 * Un tipo de equipo para entretener o trabajar,
 * de tamaño medio.
 * 
 * @version 1.5
 */
public class Tableta extends Equipo {
	private static final int RECARGO = 5000;
	private static final double INCREMENTO = 1.05;

	public Tableta(double valorBase) {
		super(valorBase, RECARGO);
	}
	
	@Override
	public double calcularPrecio() {
		return getValorBase() * INCREMENTO;
	}
}
