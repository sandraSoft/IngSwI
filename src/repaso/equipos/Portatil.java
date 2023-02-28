package repaso.equipos;

/**
 * Un tipo de equipo para entretener o trabajar,
 * de tamaño medio a grande (para morrales o escritorio).
 * 
 * @version 1.5
 */
public class Portatil extends Equipo {
	private static final int RECARGO = 10000;
	private static final double INCREMENTO = 1.1;

	public Portatil(double valorBase) {

		super(valorBase, RECARGO);
	}

	@Override
	public double calcularPrecio() {
		return getValorBase() * INCREMENTO;
	}
}
