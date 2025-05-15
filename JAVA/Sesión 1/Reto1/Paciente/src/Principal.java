public class Principal {
    public static void main(String[] args) {
        // Crear mis objetos
        //Paciente: Lena Marie
        //Edad: 25
        //Expediente: EXP202409
        paciente Paciente1 = new paciente();

        Paciente1.nombre = "Lena Marie";
        Paciente1.edad = 25;
        Paciente1.expediente = "EXP202409";

        Paciente1.mostrarInformacion();
    }
}