public class Main {
    public static void main(String[] args) {
        //  Crear una declaración de impuestos
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ABC1234567X1", 50000.0);

        // Crear una cuenta fiscal
        CuentaFiscal cuenta = new CuentaFiscal("ABC1234567X1", 120000.0);

        // Mostrar la información de ambas
        System.out.println("📄 Declaración de Impuestos:");
        System.out.println("RFC: " + declaracion.rfcContribuyente());
        System.out.println("Monto declarado: $" + declaracion.montoDeclarado());

        System.out.println("\n💼 Cuenta Fiscal:");
        System.out.println("RFC: " + cuenta.getRfc());
        System.out.println("Saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar si el RFC coincide y mostrar el resultado
        boolean rfcCoincide = cuenta.validarRFC(declaracion);
        System.out.println("\n✅ ¿El RFC coincide?: " + rfcCoincide);
    }
}

