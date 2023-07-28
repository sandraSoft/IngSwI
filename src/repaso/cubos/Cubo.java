package repaso.cubos;

/**
 * Cubo fabricado de acuerdo a dimensiones establecidas
 * y que se debe poder empacar para su transporte.
 */
public abstract class Cubo {
    private double lado;
    private double valorFabricacion;
    private Empaque empaque;

    public Cubo(double lado, double valorFabricacion) {
        this.lado = lado;
        this.valorFabricacion = valorFabricacion;
    }

    public double getLado() {
        return lado;
    }

    public void setEmpaque(Empaque empaque) {
        if (this.empaque == null) {
            this.empaque = empaque;
        }
    }

    public boolean estaEmpacado() {
        return (this.empaque != null);
    }

    /**
     * Calcula y retorna el volumen (en cm3) del cubo
     */
    public double volumen() {
        return lado*lado*lado;
    }

    /**
     * Calcula y retorna el precio de venta del cubo.
     */
    public double precio() {
        final double IVA = 0.19;
        return valorFabricacion + (valorFabricacion*IVA);
    }

    /**
     * Determina si el cubo cabe o no en el empaque dado.
     */
    public abstract boolean cabe(Empaque empaque);

    @Override
    public String toString() {
        return "Lado: "+lado+" cm. - Precio: $"+precio();
    }
}
