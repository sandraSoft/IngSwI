package repaso.equiposconenum;

/**
 * Tipos de equipos que se venden en una tienda de tecnología,
 * cada uno con su recargo por pago con tarjeta
 * y el incremento para el precio de venta.
 *
 * @version 1.0
 */
public enum TipoEquipo {
    CELULAR(2000,1),
    TABLETA(5000,1.05),
    PORTATIL(10000,1.1);

    private final int RECARGO;
    private final double INCREMENTO;

    TipoEquipo(int recargo, double incremento){
        this.RECARGO = recargo;
        this.INCREMENTO = incremento;
    }

    double getRecargo() {
        return RECARGO;
    }

    double getIncremento() {
        return INCREMENTO;
    }
}