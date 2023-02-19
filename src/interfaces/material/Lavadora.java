package interfaces.material;

/**
 * Electrodoméstico usado para lavar la ropa.
 * Se puede alquilar para su uso por otras personas.
 * @version 1.0
 */
public class Lavadora implements IAlquilable {
    private int capacidad;

    public Lavadora(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    @Override
    public double valorAlquilerMensual() {
        return 40000 + capacidad*100;
    }

    @Override
    public boolean alquilar(int meses) {
        return true;
    }
}
