package excepciones.material;

import java.util.Scanner;

public class LecturaNumero {

    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        String cadenaConNumeros = consola.next();

        try {
            int numero = Integer.parseInt(cadenaConNumeros);
            System.out.println("El número es: "+numero);
        }
        catch (NumberFormatException errorCadena){
            System.out.println("Error: "+ errorCadena.getMessage());
        }
        consola.close();

    }
}
