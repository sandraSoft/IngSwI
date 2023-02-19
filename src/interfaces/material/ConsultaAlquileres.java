package interfaces.material;

public class ConsultaAlquileres {
    public static void main(String[] args) {
        ControlAlquileres alquileres = new ControlAlquileres();
        IAlquilable alquilable1 = new Apartamento(50);
        IAlquilable alquilable2 = new Lavadora(20);

        System.out.println("Valor por tres meses: ");
        System.out.println(alquileres.calcularValorAlquiler(alquilable1,3));
        System.out.println(alquileres.calcularValorAlquiler(alquilable2,3));

        // Esto sería un error:
        // System.out.println(alquilable2.getCapacidad());
    }
}
