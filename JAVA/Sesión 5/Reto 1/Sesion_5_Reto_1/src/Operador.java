public class Operador {
    // Clase auxiliar por composición: representa al operador de la unidad
        private String nombre;

        // Constructor
        public Operador(String nombre) {
            this.nombre = nombre;
        }

        // Método que simula que el operador se reporta
        public void reportarse() {
            System.out.println("Operador " + nombre + " reportándose");
        }
    }