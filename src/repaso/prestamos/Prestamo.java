package repaso.prestamos;

/**
 * Un préstamo en una entidad cooperativa,
 * con diferentes formas de calcular el interés anual.
 */
public abstract class Prestamo {
    private double valor;
    private double tasaMensual;

    public Prestamo(double valor, double tasaMensual) {
        this.valor = valor;
        this.tasaMensual = tasaMensual;
    }

    public double getValor() {
        return valor;
    }

    public double getTasaMensual() {
        return tasaMensual;
    }

    /**
     * @return  el valor de los interesese anuales, en pesos.
     */
    public abstract double calcularInteresesAnuales();
}
