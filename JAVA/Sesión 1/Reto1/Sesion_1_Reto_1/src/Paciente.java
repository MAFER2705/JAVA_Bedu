public class Paciente {
    //Atributos
    String nombre;
    int edad;
    String numeroExpediente;

    //Método que muestra los datos del paciente
    void mostrarinformacion() {
        System.out.println("Informacion del paciente");
        System.out.println("Paciente" + nombre);
        System.out.println("Edad" + edad);
        System.out.println("Expediente" + numeroExpediente);
    }

}