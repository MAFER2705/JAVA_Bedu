//Crea un arreglo de tipo MetodoPago con instancias mezcladas (polimorfismo)
//Recorre el arreglo, llama a autenticar() y si es válido, llama a procesarPago() y mostrarResumen()

public class CajaRegistradora {
    public static void main(String[] args) {
        MetodoPago[] pagos = {
                new PagoEfectivo(200),
                new PagoTarjeta(450.0, 500.0),
                new PagoTransferencia(360.0, false) // esta fallará en autenticación
        };

        for (MetodoPago pago : pagos) {
            if (pago.autenticar()) {
                System.out.println("Autenticación exitosa.");
                pago.procesarPago();
                pago.mostrarResumen();
            } else {
                System.out.println("Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
            }
            System.out.println();
        }
    }
}
