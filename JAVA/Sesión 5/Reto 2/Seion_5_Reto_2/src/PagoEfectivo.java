//autenticar() siempre retorna true (no requiere validación)

public class PagoEfectivo extends MetodoPago {

    public PagoEfectivo(double monto) { super(monto);
    }

    public boolean autenticar() {
        return true;  // No se requiere validación para efectivo
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}
