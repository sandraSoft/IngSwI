package repaso.equiposconenum;

/**
 * Tipos de equipos que se venden en una tienda de tecnología,
 * cada uno con su recargo por pago con tarjeta
 * y el incremento para el precio de venta.
 */
public enum TipoEquipo {
    CELULAR(2000,1),
    TABLETA(5000,1.05),
    PORTATIL(10000,1.1);

    private final int recargo;
    private final double incremento;

    TipoEquipo(int recargo, double incremento){
        this.recargo = recargo;
        this.incremento = incremento;
    }

    double getRecargo() {
        return recargo;
    }

    double getIncremento() {
        return incremento;
    }
}