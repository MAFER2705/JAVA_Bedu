import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorDeLogs {

    public static void main(String[] args) {
        Path rutaLogs = Paths.get("C:/Users/Praxis/Desktop/JAVA/Sesión 7/Reto 2/Sesion_7_Reto_2/src/Sesion_7_Reto_2/errores.logs");
        Path rutaError = Paths.get("src/Sesion_7_Reto_2/registro_fallos.txt");

        int totallineas = 0;
        int conteoErrores = 0;
        int conteoWarnings = 0;

        try (BufferedReader lector = Files.newBufferedReader(rutaLogs)) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                totallineas++;
                if (linea.contains("ERROR")) {
                    conteoErrores++;
                }
                if (linea.contains("WARNING")) {  // ← CORREGIDO: WARNING en lugar de WARMING
                    conteoWarnings++;
                }
            }

            System.out.println("Análisis completado:");
            System.out.println("Total de líneas leídas: " + totallineas);
            System.out.println("Total de errores (ERROR): " + conteoErrores);
            System.out.println("Total de advertencias (WARNING): " + conteoWarnings);

            double porcentajeErrores = (totallineas > 0) ? ((double) conteoErrores / totallineas) * 100 : 0;
            double porcentajeWarnings = (totallineas > 0) ? ((double) conteoWarnings / totallineas) * 100 : 0;

            System.out.printf("Porcentaje de líneas con errores: %.2f%%\n", porcentajeErrores);
            System.out.printf("Porcentaje de líneas con advertencias: %.2f%%\n", porcentajeWarnings);
        } catch (IOException e) {
            System.out.println("Error al procesar el archivo de logs: " + rutaLogs.toString());

            // Crear carpeta si no existe y escribir error
            try {
                Files.createDirectories(rutaError.getParent()); // ← Se asegura que la carpeta existe
                try (BufferedWriter escritor = Files.newBufferedWriter(rutaError)) {
                    escritor.write("Se produjo un error al leer el archivo 'errores.logs': " + e.getMessage());
                }
            } catch (IOException ex) {
                System.out.println("Además, no se pudo escribir en el archivo de registro de fallos.");
            }
        }
    }
}