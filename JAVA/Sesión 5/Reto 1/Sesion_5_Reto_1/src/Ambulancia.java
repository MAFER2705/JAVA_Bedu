public class Ambulancia extends UnidadEmergencia {
        private final SistemaGPS gps;
        private final Sirena sirena;
        private final Operador operador;

        public Ambulancia(String nombre, String nombreOperador) {
            super(nombre);
            this.gps = new SistemaGPS();
            this.sirena = new Sirena();
            this.operador = new Operador(nombreOperador);
        }

        @Override
        public void responder() {
            System.out.println("Ambulancia en camino al lugar del accidente");
        }

        public void iniciarOperacion() {
            activarUnidad();
            gps.localizar();
            sirena.activarSirena();
            operador.reportarse();
            responder();
        }
    }
