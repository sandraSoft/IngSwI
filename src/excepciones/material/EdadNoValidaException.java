package excepciones.material;

/**
 * Excepción que se lanza cuando la edad no cumple con el rango definido.
 */
public class EdadNoValidaException extends Exception {

    public EdadNoValidaException(String mensaje) {
        super(mensaje);
    }
}


