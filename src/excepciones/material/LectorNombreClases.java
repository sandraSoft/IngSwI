package excepciones.material;

import java.util.Scanner;
/**
 * Pide nombres de clases y dice si existen o no en el API de Java.
 * @version 1.0
 */
public class LectorNombreClases {

    public static void main(java.lang.String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System. in);

        while (!salir) {
            System.out.print("Nombre completo clase: ");
            String nombreClase = scanner.nextLine();
            if (nombreClase.equals("salir")) {
                salir = true;
            }
            else {
                try {
                    Class.forName(nombreClase);
                    System.out.println("La clase "+nombreClase+" existe");
                }
                catch (ClassNotFoundException noExiste) {
                    System.out.println("La clase no existe");
                }
            }
        }
        scanner.close();
    }
}
