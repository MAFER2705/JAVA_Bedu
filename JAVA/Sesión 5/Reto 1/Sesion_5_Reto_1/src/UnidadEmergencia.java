public abstract class UnidadEmergencia {
    String nombre;

    // Atributo
    public UnidadEmergencia(String nombre) {
        this.nombre = nombre;
    }

    //Método abstracto
    public abstract void responder();

    //Método concreto que imprima mensaje de activacion
    public void activarUnidad() {
        System.out.println(nombre + " activada desde la central.");
    }

}