package interfaces.material;

/**
 * Un lugar para habitar; parte independiente de un edificio o casa.
 * @version 1.0
 */
public class Apartamento implements IAlquilable {
    private double area;
    private char estado;	//d:disponible, a:alquilado

    public Apartamento(double area) {
        this.area = area;
        this.estado = 'd';
    }

    @Override
    public double valorAlquilerMensual() {
        final double VALOR_M2 = 10000;
        return (area * VALOR_M2);
    }

    @Override
    public boolean alquilar(int meses) {
        if (this.estado == 'd') {
            this.estado = 'a';
            return true;
        }
        return false;
    }
}
