public class UnidadBomberos extends UnidadEmergencia {
    private final SistemaGPS gps;
    private final Sirena sirena;
    private final Operador operador;

    public UnidadBomberos(String nombre, String nombreOperador) {
        super(nombre);
        this.gps = new SistemaGPS();
        this.sirena = new Sirena();
        this.operador = new Operador(nombreOperador);
    }

    @Override
    public void responder() {
        System.out.println("Unidad de bomberos en ruta al incendio");
    }

    public void iniciarOperacion() {
        activarUnidad();
        gps.localizar();
        sirena.activarSirena();
        operador.reportarse();
        responder();
    }
}
