package excepciones.taller;

import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * Programa que usa funciones del API de Java con excepciones no comprobadas.
 *
 * @version 1.0
 */
public class ProgramaDiaNacimiento {

    public static void main(String[] args) {
        ProgramaDiaNacimiento programa =
                new ProgramaDiaNacimiento();
        programa.leerFechaMostrarDia();
    }

    /**
     * Pide al usuario el año, mes y día de su nacimiento (como enteros),
     * obtiene el día de la semana de esa fecha y lo muestra.
     *
     * Permite tener un ejemplo de manejo de excepciones NO COMPROBADAS (UNCHECKED)
     */

    public void leerFechaMostrarDia(){
        Scanner consola = new Scanner(System.in);
        System.out.print("Año:");
        int anho = consola.nextInt();
        System.out.print("Mes:");
        int mes = consola.nextInt();
        System.out.print("Día:");
        int dia = consola.nextInt();

        Fecha fecha = new Fecha();
        try {
            DayOfWeek diaSemana = fecha.diaSemana(
                    anho, mes, dia);

            switch (diaSemana) {
                case MONDAY -> System.out.println("lunes");
                case TUESDAY -> System.out.println("martes");
                case WEDNESDAY -> System.out.println("miércoles");
                case THURSDAY -> System.out.println("jueves");
                case FRIDAY -> System.out.println("viernes");
                case SATURDAY -> System.out.println("sábado");
                default -> System.out.println("domingo");
            }
        }
        catch (DateTimeException errorFecha){
            System.out.println("Fecha incorrecta "+
                    errorFecha.getMessage());
        }
    }

}
