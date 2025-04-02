package enums.taller.inicial;

import java.time.LocalDate;

// pruebas informales de la notaría
public class ProgramaNotaria {
    public static void main(String[] args) {
        Notaria notaria = new Notaria();
        Persona personaCasada = new Persona("Pepe","casada", LocalDate.of(1980,9,4));
        Persona personaEstadoNoValido = new Persona("Pepe","separada", LocalDate.of(1990,7,12));

        System.out.println("Debe mostrar: Divorcio, Negocios");
        System.out.println(notaria.consultarProcesos(personaCasada));

        System.out.println("No es recomendable, pero debe mostrar: null");
        System.out.println(notaria.consultarProcesos(personaEstadoNoValido));
    }
}
