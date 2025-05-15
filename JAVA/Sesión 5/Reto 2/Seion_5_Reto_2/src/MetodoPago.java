public abstract class MetodoPago {

    // Atributo
    public double monto;

    public MetodoPago(double monto) { this.monto = monto;
    }

    //Método abstracto
    public abstract void procesarPago();

    //Método concreto que imprima el tipo de pago y el monto
    public void mostrarResumen() {
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName() + " - Monto: $" + monto);;
    }

    public abstract boolean autenticar();
}
