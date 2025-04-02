package repaso.prestamos;

/**
 * Tipo de préstamo con tasa efectiva
 *  (que es una forma de obtener intereses con una fórmula).
 */
public class Efectivo extends Prestamo {
    public Efectivo(double valor, double tasaMensual) {
        super(valor, tasaMensual);
    }

    @Override
    public double calcularInteresesAnuales() {
        double tasaEfectiva = Math.pow(1+getTasaMensual(),12) - 1;
        return getValor() * tasaEfectiva;
    }
}
