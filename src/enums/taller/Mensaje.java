package enums.taller;

/**
 * Un mensaje publicitario que hace parte de una campaña.
 */
public class Mensaje {
    private String texto;
    private Estado estado;

    public Mensaje(String texto, Estado estado) {
        this.texto = texto;
        this.estado = estado;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
