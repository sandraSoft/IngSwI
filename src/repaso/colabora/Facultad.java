package repaso.colabora;

import repaso.negocios.Organizable;
import java.util.ArrayList;
import java.util.List;

/**
 * Unidad en una Universidad, que agrupa programas de una disciplina.
 */
public class Facultad implements Organizable {
    private int cantidadDepartamentos;
    private List<Unipersonal> convenios;

    public Facultad(int cantidadDepartamentos) {
        this.cantidadDepartamentos = cantidadDepartamentos;
        this.convenios = new ArrayList<>();
    }

    @Override
    public double calcularCantidadOficinas() {
        return this.cantidadDepartamentos * 10;
    }
}
