package excepciones.taller;

import java.io.IOException;
import java.util.zip.ZipFile;

/**
 * Clase para operaciones con un archivo zip
 *
 * @version  1.0
 */
public class ArchivoZip {

    /**
     * Obtener la cantidad de archivos en un zip.
     * Puede lanzar una EXCEPCIÓN COMPROBADA
     * (por esto tiene el "throws" en el encabezado)
     *
     * @param rutaArchivo el nombre completo del archivo zip, incluyendo la ruta,
     *                    por ejemplo: "c:/datos/comprimido.zip"
     * @return la cantidad de archivos que tiene internamente el zip
     * @throws IOException si no es posible encontrar el archivo u obtener los datos.
     */
    public int cantidadArchivos(String rutaArchivo)
            throws IOException {
        ZipFile archivoZip = new ZipFile(rutaArchivo);
        return archivoZip.size();
    }
}
