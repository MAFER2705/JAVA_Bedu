import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class GestionTemas {
    public static void main(String[] args) {

        // Lista concurrente de temas
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        // Agregamos temas
        temas.add(new Tema("Matemáticas", 3));
        temas.add(new Tema("Cívica", 2));
        temas.add(new Tema("Literatura", 1));

        // Repositorio concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Matemáticas", "https://recursos.edu/mate");
        recursos.put("Literatura", "https://recursos.edu/literatura");
        recursos.put("Cívica", "https://recursos.edu/civica");

        // Mostrar lista ordenada alfabéticamente (por título)
        List<Tema> ordenAlfabetico = new ArrayList<>(temas);
        Collections.sort(ordenAlfabetico);
        System.out.println("Temas ordenados alfabéticamente:");
        for (Tema t : ordenAlfabetico) {
            System.out.println("- " + t);
        }

        // Ordenar por prioridad
        List<Tema> ordenPorPrioridad = new ArrayList<>(temas);
        ordenPorPrioridad.sort(Comparator.comparingInt(t -> t.prioridad));
        System.out.println("Temas ordenados por prioridad:");
        for (Tema t : ordenPorPrioridad) {
            System.out.println("- " + t);
        }

        // Mostrar recursos
        System.out.println("Repositorio de recursos:");
        for (Map.Entry<String, String> entrada : recursos.entrySet()) {
            System.out.println("- " + entrada.getKey() + " → " + entrada.getValue());
        }
    }
}
