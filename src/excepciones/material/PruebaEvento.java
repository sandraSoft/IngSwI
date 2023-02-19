package excepciones.material;

import java.time.LocalDate;

public class PruebaEvento {

    public static void main(String[] args) {
        Evento evento = new Evento();
        System.out.print("Con fecha 10 de mayo de 2003: ");
        LocalDate fechaNacimiento = LocalDate.of(2003,5,10);
        boolean entrada = evento.pudeEntrarEvento(fechaNacimiento);
        System.out.println(entrada);

        System.out.print("Con fecha 10 de mayo de 2021: ");
        fechaNacimiento = LocalDate.of(2021,5,10);
        entrada = evento.pudeEntrarEvento(fechaNacimiento);
        System.out.println(entrada);
    }
}
