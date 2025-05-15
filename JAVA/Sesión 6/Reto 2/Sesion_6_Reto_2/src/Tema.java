import java.util.concurrent.*;
import java.util.*;

// Clase Tema que implementa Comparable para orden natural (por título)
class Tema implements Comparable<Tema> {
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad) {
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural: por título
    @Override
    public int compareTo(Tema otro) {
        return this.titulo.compareTo(otro.titulo);
    }

    @Override
    public String toString() {
        return titulo + " (Prioridad: " + prioridad + ")";
    }
}