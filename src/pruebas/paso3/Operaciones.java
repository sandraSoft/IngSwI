package pruebas.paso3;

public class Operaciones {
    /**
     * División entre dos números reales
     * @param numerador	el numerador o dividendo de la división
     * @param denominador	el denominador o divisor de la división
     * @return	el resultado de la división
     * @throws Exception si el denominador es cero
     */
    public double dividir (double numerador, double denominador) throws Exception {
        if (denominador == 0) {
            throw new Exception("No se puede dividir por cero");
        }
        return numerador/denominador;
    }
}
