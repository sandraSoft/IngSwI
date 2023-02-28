package repaso.equiposconenum;

import java.util.ArrayList;
import java.util.List;

/**
 * Datos de las ventas de la tienda de electrónicos,
 * para poder obtener totales al final del día.
 *
 * @version 1.0
 */
public class ControlVentas {
    private List<Venta> ventas;

    public ControlVentas() {
        ventas = new ArrayList<>();
    }

    public void registrarVenta(Equipo producto, boolean conTarjeta) {
        Venta venta = new Venta(producto,conTarjeta);
        ventas.add(venta);
    }

    /**
     * Calcula (suma) total de las ventas registradas.
     *
     * @return el valor de todas las ventas, en pesos.
     */
    public double calcularValor() {
        double valorTotal = 0;
        for (Venta venta : ventas) {
            valorTotal+=venta.calcularValor();
        }
        return valorTotal;
    }
}
