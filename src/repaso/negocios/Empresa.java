package repaso.negocios;

/**
 * Entidad que produce bienes o servicios.
 */
public class Empresa {
    private String nombre;
    protected int empleados;

    public Empresa(String nombre, int empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }
}
