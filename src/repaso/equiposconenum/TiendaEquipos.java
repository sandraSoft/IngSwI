package repaso.equiposconenum;

// Pruebas informales del programa
public class TiendaEquipos {

    public static void main(String[] args) {
        ControlVentas control = new ControlVentas();
        control.registrarVenta(new Equipo(150000,TipoEquipo.CELULAR), false);
        control.registrarVenta(new Equipo(200000,TipoEquipo.CELULAR), true);
        control.registrarVenta(new Equipo(300000,TipoEquipo.TABLETA), true);
        control.registrarVenta(new Equipo(250000,TipoEquipo.TABLETA), false);
        control.registrarVenta(new Equipo(2000000,TipoEquipo.PORTATIL), true);
        control.registrarVenta(new Equipo(2500000,TipoEquipo.PORTATIL), false);

        System.out.println("Debe mostrar 5.894.500");
        System.out.printf("El total de ventas es: %,.0f ", control.calcularValor());
    }
}