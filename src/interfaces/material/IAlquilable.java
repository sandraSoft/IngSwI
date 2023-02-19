package interfaces.material;

/**
 * Elementos que pueden ser alquilados por un tiempo (a cambio de un pago)
 * @version 1.0
 */
public interface IAlquilable {
    /**
     * Permite conocer el valor mensual del alquiler.
     * @return el valor, en pesos, del alquiler del objeto por un mes.
     */
    public abstract double valorAlquilerMensual();

    /**
     * Alquilar el objeto por un tiempo dado.
     * @param meses	la cantidad de meses que se alquilará el objeto.
     * @return si se pudo alquilar o no (pues ya estaba alquilado)
     */
    boolean alquilar(int meses);		// Es público y abstracto
}

