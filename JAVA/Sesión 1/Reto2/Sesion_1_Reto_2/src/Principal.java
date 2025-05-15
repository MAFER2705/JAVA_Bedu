//Clase main para probar el sistema
public class Principal {
    public static void main(String[] args) {
        Entrada E1 = new Entrada("Obra de Teatro", 450.00);
        Entrada E2 = new Entrada("Eposición de Arte", 50.00);
        E1.mostrarInformacion();
        E2.mostrarInformacion();

        //Reto adicional
        Entrada_Record E3= new Entrada_Record("Cuarteto de cuerdas", 1200.00);
        E3.mostrarInformacion();
    }
}
