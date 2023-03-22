package repaso.colabora;
import repaso.negocios.Empresa;

/**
 * Empresa de una sola persona.
 */
public class Unipersonal extends Empresa {
    boolean factura;

    public Unipersonal(String nombre, int empleados, boolean factura) {
        super(nombre, empleados);
        this.factura = factura;
    }
}
