package excepciones.material;

import java.time.LocalDate;
import java.time.Period;

public class ControlEdad {

    public int calcularEdad (LocalDate nacimiento) throws EdadNoValidaException {
        LocalDate hoy = LocalDate.now();
        int edad = Period.between(nacimiento, hoy).getYears();
        if (edad < 18 || edad > 99) {      // si la edad no está entre 18 y 99
            throw new EdadNoValidaException("Edad no válida para el evento");
        }
        return edad;
    }

}
