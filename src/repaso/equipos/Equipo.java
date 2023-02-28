package repaso.equipos;

/**
 * Equipo electrónico que se vende en una tienda.
 * 
 * @version 1.0
 */
public abstract class Equipo {
	private double valorBase;
	private double recargo;
	
	public Equipo(double valorBase, double recargo) {
		this.valorBase = valorBase;
		this.recargo = recargo;
	}

	double getValorBase() {
		return valorBase;
	}
	
	public double getRecargo() {
		return this.recargo;
	}
	
	/**
	 * Calcula el precio del equipo a partir de una base 
	 * e incrementos por el tipo de equipo.
	 * 
	 * @return el precio del equipo, en pesos
	 */
	public abstract double calcularPrecio();	

}
