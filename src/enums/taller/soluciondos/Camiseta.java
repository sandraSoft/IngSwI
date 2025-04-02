package enums.taller.soluciondos;

/**
 * Prenda de vestir para el torso, de algún estilo y talla.
 * Usada para mostrar un ejemplo de uso de ENUM.
 *
 * @version 1.0
 */
public class Camiseta {
    private String estilo;
    private Talla talla;

    public Camiseta(String estilo, Talla talla) {
        this.estilo = estilo;
        this.talla = talla;
    }

    public String toString(){
        return "Camiseta estilo "+estilo+" talla "+talla;
    }
}
