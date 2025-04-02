package enums.taller.inicial;

/**
 * Notaría que ofrece servicios a las personas.
 *
 * Ejercicio para el uso de ENUM.
 */
public class Notaria {

    public String consultarProcesos(Persona persona){
        if (persona.getEdad() < 18){
            return "Debe venir con un acudiente";
        }

        switch (persona.getEstadoCivil()){
            case "soltera": return "Matrimonio, Negocios";
            case "casada": return "Divorcio, Negocios";
            case "viuda": return "Herencia, Negocios";
        }

        return null;
    }
}
