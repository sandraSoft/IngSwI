package repaso.prestamos;

import java.util.ArrayList;

/**
 * Se registran los préstamos realizados para poder
 * obtener el valor total de intereses anuales que se obtendrían.
 */
public class ReporteInteresesAnuales {
    private ArrayList<Prestamo> prestamos;

    public ReporteInteresesAnuales(){
        this.prestamos = new ArrayList<>();
    }

    public void adicionarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public double calcularTotalInteresAnuales(){
        double totalIntereses =  0;
        for (Prestamo prestamo: prestamos) {
            totalIntereses+=prestamo.calcularInteresesAnuales();
        }
        return totalIntereses;
    }
}
