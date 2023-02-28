package repaso.equipos;

/**
 * Un tipo de equipo para comunicar y entretener,
 * relativamente pequeño (para bolsillos o bolsos).
 * 
 * @version 1.5
 */
public class Celular extends Equipo {
	private static final int RECARGO = 2000;

	public Celular(double valorBase) {
		super(valorBase, RECARGO);
	}
	
	@Override
	public double calcularPrecio() {
		return this.getValorBase();
	}
}
