import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class RegistroSimulacion {

    public static void main(String[] args) {
// Definir ruta del archivo.txt
        Path rutaCarpeta = Paths.get("src/Sesion_7_Reto_1/config");
        Path rutaArchivo = rutaCarpeta.resolve("parametros.txt");

        //Crear string con los parámetros
        String parametros = "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8";

        try {
            //crear carpeta config sí no existe
            if (!Files.exists(rutaCarpeta)) {
                Files.createDirectories(rutaCarpeta);
                System.out.println("Carpeta 'config' creada.");

            }

            //Escribimos el contenido en el archivo
            Files.write(rutaArchivo, parametros.getBytes());
            System.out.println("Archivo de parámetros escrito correctamente.");

            //Validar si el archivo fue creado
            if (Files.exists(rutaArchivo)) {
                System.out.println("El archivo fue creado exitosamente en:" + rutaArchivo.toAbsolutePath());

                //Leer contenido y mostrarlo
                String contenidoleido = Files.readString(rutaArchivo);
                System.out.println("Contenido del archivo");
                System.out.println(contenidoleido);
            } else {
                System.out.println("El archivo no fue creado");
            }

        } catch (IOException e) {
            System.out.println("Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}