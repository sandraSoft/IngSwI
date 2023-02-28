package repaso.equipos;

// Pruebas informales del programa
public class TiendaEquipos {

	public static void main(String[] args) {
		ControlVentas control = new ControlVentas();
		control.registrarVenta(new Celular(150000), false);
		control.registrarVenta(new Celular(200000), true);
		control.registrarVenta(new Tableta(300000), true);
		control.registrarVenta(new Tableta(250000), false);
		control.registrarVenta(new Portatil(2000000), true);
		control.registrarVenta(new Portatil(2500000), false);

		System.out.println("Debe mostrar 5.894.500");
		System.out.printf("El total de ventas es: %,.0f ", control.calcularValor());
	}
}
