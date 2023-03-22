package repaso.negocios;

/**
 * Entidad que se puede organizar en oficinas.
 */
public interface Organizable {
    /**
     * Determina las oficinas que se pueden crear en un espacio
     * @return la cantidad de oficinas.
     */
    public abstract double calcularCantidadOficinas();
}
