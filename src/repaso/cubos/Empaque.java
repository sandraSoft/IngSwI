package repaso.cubos;

/**
 * Empaque de un cubo en una fábrica de cubos
 */
public record Empaque(double largo, double ancho, double alto) {

    /**
     * @return el volumen del cubo (en cm3)
     */
    public double volumen() {
        return largo*ancho*alto;
    }
}
