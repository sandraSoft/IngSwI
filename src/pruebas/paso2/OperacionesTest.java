package pruebas.paso2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {
    @Test
    void testDividirPositivos() {
        // Configurar (Arrange)
        Operaciones operar = new Operaciones();
        double resultadoEsperado = 5;

        // Ejecutar (Act)
        double resultado = operar.dividir(10, 2);

        // Verificar (Assert)
        assertEquals(resultadoEsperado,resultado);
    }

    @Test
    void testDividirPorCero() {
        // Configurar (Arrange)
        Operaciones operar = new Operaciones();

        // Ejecutar (Act) y Verificar (Assert)
        assertThrows(Exception.class,
                ()->operar.dividir(500,0));
    }
}