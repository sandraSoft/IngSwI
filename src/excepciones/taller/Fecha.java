package excepciones.taller;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Operaciones diversas con fechas
 *
 * @version 1.0
 */
public class Fecha {

    /**
     * Retorna el día de la semana de una fecha dada.
     * Puede lanzar una EXCEPCIÓN NO COMPROBADA
     * (por eso NO tiene "throws" en el encabezado).
     *
     * @param anho un entero con el año de la fecha que se analizará, por ejemplo: 2001.
     * @param mes un entero con el valor del mes de la fecha,
     *            debe ser un valor entre 1 y 12.
     * @param dia un entero con el día del mes para la fecha deseada,
     *            debe estar entre 1 y 31, para febrero solo hasta 28
     *            y para abril, junio, septiembre y noviembre hasta 30.
     *
     * @return día que corresponde a la fecha ingresada.
     * @throws java.time.DateTimeException  si la fecha ingresada no es válida.
     */
    public DayOfWeek diaSemana(int anho, int mes, int dia){
        LocalDate fecha = LocalDate.of(anho, mes,dia);
        return fecha.getDayOfWeek();
    }

}
