package repaso.cubos;

/**
 * Un cubo de material rígido,
 * que no le permite adaptarse a espacios más pequeños.
 * Su empaque debe ser mayor en todas las dimensiones
 * (largo, ancho, alto).
 */
public class CuboRigido extends Cubo {

    public CuboRigido(double lado, double valorFabricacion) {
        super(lado, valorFabricacion);
    }

    @Override
    public boolean cabe(Empaque empaque) {
        double lado = this.getLado();
        return (empaque.alto() > lado &&
                empaque.ancho() > lado &&
                empaque.largo() > lado);
    }
}