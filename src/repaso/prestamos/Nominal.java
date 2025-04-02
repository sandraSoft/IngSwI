package repaso.prestamos;

/**
 * Tipo de préstamo con tasa nominal
 *  (es decir, un cálculo directo del porcentaje en cada mes).
 */
public class Nominal extends Prestamo {

    public Nominal(double valor, double tasaMensual) {
        super(valor, tasaMensual);
    }

    @Override
    public double calcularInteresesAnuales() {
        return getValor() * getTasaMensual() * 12;
    }
}
