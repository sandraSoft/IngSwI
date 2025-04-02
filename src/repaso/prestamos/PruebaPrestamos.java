package repaso.prestamos;

public class PruebaPrestamos {

    public static void main(String[] args) {
        Prestamo prestamo1 = new Nominal(2000000,0.015);
        Prestamo prestamo2 = new Efectivo(2000000,0.015);
        ReporteInteresesAnuales reporte = new ReporteInteresesAnuales();
        reporte.adicionarPrestamo(prestamo1);
        reporte.adicionarPrestamo(prestamo2);
        System.out.println(reporte.calcularTotalInteresAnuales());
    }
}
