package interfaces.material;

public class ControlAlquileres  {

    /**
     * Calcula al valor de un elemento que se desea alquilar por unos meses.
     * @param alquilable	objeto que se desea alquilar
     * @param meses	los meses que se desea alquilar
     * @return el valor del alquiler, considerando el valor y los meses
     */
    public double calcularValorAlquiler(IAlquilable alquilable, int meses) {
        return alquilable.valorAlquilerMensual() * meses;
    }
}

