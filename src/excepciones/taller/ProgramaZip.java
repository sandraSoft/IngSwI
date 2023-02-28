package excepciones.taller;

import java.io.IOException;
import java.util.Scanner;

/**
 * Programa que usa funciones del API de Java con excepciones comprobadas.
 *
 * @version 1.0
 */
public class ProgramaZip {
    public static void main(String[] args) {
        ProgramaZip programa = new ProgramaZip();
        programa.mostrarCantidadArchivos();
    }

    /**
     * Pide el nombre de un archivo zip y muestra la cantidad
     *  de archivos que tiene internamente.
     *
     * Permite tener un ejemplo de manejo de excepciones COMPROBADAS (CHECKED)
     */
    public void mostrarCantidadArchivos() {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ruta archivo: ");
        String rutaArchivo = consola.next();

        ArchivoZip archivo = new ArchivoZip();
        try {
            int cantidadArchivos = archivo.cantidadArchivos(rutaArchivo);
            System.out.println("Cantidad: "+cantidadArchivos);
        } catch (IOException errorArchivo){
            System.out.println("La ruta no corresponde a un" +
                    "archivo zip. Revisar.");
        }
    }
}
