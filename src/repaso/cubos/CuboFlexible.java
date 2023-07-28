package repaso.cubos;

/**
 * Un cubo de material flexible,
 * que  le permite adaptarse a espacios más pequeños.
 * Su empaque solo debe tener mayor volumen.
 */
public class CuboFlexible extends Cubo {
    private int elasticidad;

    public CuboFlexible(double lado, double valorFabricacion, int elasticidad) {
        super(lado, valorFabricacion);
        this.elasticidad = elasticidad;
    }

    @Override
    public boolean cabe(Empaque empaque) {
        return (empaque.volumen() > this.volumen());
    }

    @Override
    public double precio() {
        double precio = super.precio();
        precio+= (elasticidad < 50)? precio*0.04 : precio*0.06;
        return precio;
    }
}