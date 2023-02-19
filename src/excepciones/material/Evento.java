package excepciones.material;

import java.time.LocalDate;

public class Evento {
    private ControlEdad controlEdad;

    public Evento(){
        controlEdad = new ControlEdad();
    }

    public boolean pudeEntrarEvento(LocalDate nacimiento){
        try{
            controlEdad.calcularEdad(nacimiento);
            return true;
        } catch (EdadNoValidaException edadNoValida){
            return false;
        }
    }
}
