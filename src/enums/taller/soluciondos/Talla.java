package enums.taller.soluciondos;

public enum Talla {
    SMALL("pequeña"),
    MEDIUM("mediana"),
    LARGE("large");

    private final String talla;

    private Talla(String talla){
        this.talla = talla;
    }

    @Override
    public String toString(){
        return talla;
    }
}
