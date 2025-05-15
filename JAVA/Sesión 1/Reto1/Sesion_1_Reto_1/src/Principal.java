//Solicitar la información del usuario

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Crear un objeto tipo paciente
        Paciente p1 = new Paciente();

        //Solicitar datos asignados
        System.out.println("Ingresa el nombre del paciente");
        p1.nombre = scanner.nextLine();

        System.out.println("Ingresa la edad");
        p1.edad = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingresa el número de expediente");
        p1.numeroExpediente = scanner.nextLine();

        //Mostrar datos
        p1.mostrarinformacion();

        //Cerrar scanner
        scanner.close();
    }
}
