import java.util.*;

public class RegistroMuestras {
    public static void main(String[] args) {

        // Paso 1: ArrayList para registrar todas las especies en orden
        ArrayList<String> ListaMuestras = new ArrayList<>();

        //Agregar lista de muestras en orden(pueden ser repetidas)
        ListaMuestras.add("Homo sapiens");
        ListaMuestras.add("Mus musculus");
        ListaMuestras.add("Arabidopsis thaliana");
        ListaMuestras.add("Homo sapiens");

        //Imprime las muestras en orden
        System.out.println("Orden de llegada de las muestras");
        for (String especie : ListaMuestras) {
            System.out.println("-" + especie);
        }
        // Paso 2: HashSet para filtrar especies únicas
        Set<String> especiesUnicas = new HashSet<>(ListaMuestras);

        // Imprimir especies únicas
        System.out.println("Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }
        // Paso 3: HashMap para asociar ID de muestra con investigador
        Map<String, String> IDdeMuestra = new HashMap<>();
        IDdeMuestra.put("M-001", "Dra. López");
        IDdeMuestra.put("M-002", "Dr. Hernández");
        IDdeMuestra.put("M-003", "Dra. García");
        IDdeMuestra.put("M-004", "Dr. Cortés");

        //Imprimir ID de muestra
        System.out.println("Id de muestra (ID + ListaMuestras):");
        for (Map.Entry<String, String> entry : IDdeMuestra.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
        // Paso 4: Mostrar resultados
        String idbuscar = "M-002";
        if (IDdeMuestra.containsKey(idbuscar)) {
            String especieEncontrada = IDdeMuestra.get(idbuscar);
            System.out.println("Resultado de búsqueda para ID " + idbuscar + ": " + especieEncontrada);
        } else {
            System.out.println("No se encontró ninguna especie con el ID " + idbuscar);
        }
    }
}