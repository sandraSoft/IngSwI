package repaso.equiposconenum;

/**
 * Equipo electrónico que se vende en una tienda.
 *
 * @version 2.0
 */
public class Equipo {
    private double valorBase;
    private TipoEquipo tipo;

    public Equipo(double valorBase, TipoEquipo tipo) {
        this.valorBase = valorBase;
        this.tipo = tipo;
    }

    double getRecargo() {
        return tipo.getRecargo();
    }

    /**
     * Calcula el precio del equipo a partir de una base
     * e incrementos por el tipo de equipo
     * @return el precio del equipo, en pesos
     */
    public double calcularPrecio() {
        return this.valorBase * tipo.getIncremento();
    }
}

