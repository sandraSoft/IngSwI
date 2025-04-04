package repaso.equiposconenum;

/**
 * Información de la venta de un equipo electrónico.
 */
public class Venta {
    private Equipo producto;
    private boolean conTarjeta;

    public Venta(Equipo producto, boolean conTarjeta) {
        this.producto = producto;
        this.conTarjeta = conTarjeta;
    }

    /**
     * Calcula el valor de la venta considerando la forma de pago.
     *
     * @return el valor de la venta, en pesos.
     */
    public double calcularValor() {
        double valor = producto.calcularPrecio();
        if (conTarjeta) {
            valor += producto.getRecargo();
        }
        return valor;
    }
}