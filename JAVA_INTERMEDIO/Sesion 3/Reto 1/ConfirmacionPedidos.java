import java.util.*;

public class ConfirmacionPedidos {

    public static void main(String[] args) {
        List<Pedido> pedidos = List.of(
                new Pedido("Hugo", "domicilio", "562-5789"),
                new Pedido("Lucia", "local", null),
                new Pedido("Alejandra", "domicilio", null),
                new Pedido("Carolina", "domicilio", "534-2580")
        );

        // 🛒 Almacenamos los mensajes en una lista
        List<String> mensajes = pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // Filtrar por entrega a domicilio
                .map(Pedido::getTelefono) // Transformar Pedido → Optional<String>
                .filter(Optional::isPresent) // Filtrar los Optional con valor
                .map(Optional::get) // 📥 Extraer el número del Optional
                .map(tel -> "Confirmación enviada al número: " + tel) // Crear mensaje
                .toList(); // Recolectar en una lista

        // 🖨️ Mostrar los mensajes (podrías guardarlos, enviarlos, etc.)
        System.out.println("Confirmaciones de pedidos a domicilio:");
        mensajes.forEach(System.out::println);
    }
}