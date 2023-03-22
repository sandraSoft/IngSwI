package repaso.negocios;

/**
 * Una "pequeña o mediana empresa", con pocos empleados.
 */
public class Pyme extends Empresa implements Organizable {
    public Pyme(String nombre, int empleados) {
        super(nombre, empleados);
    }

    @Override
    public double calcularCantidadOficinas() {
        return this.empleados * 1.05;
    }
}
