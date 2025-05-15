public static void main(String[] args) {
    Operador operador1 = new Operador("Luis");
    Operador operador2 = new Operador("Ana");
    Operador operador3 = new Operador("Carlos");

    Ambulancia ambulancia = new Ambulancia("Ambulancia A1", operador1);
    Patrulla patrulla = new Patrulla("Patrulla P2", operador2);
    UnidadBomberos bomberos = new UnidadBomberos("Bomberos B3", operador3);

    System.out.println("--- INICIANDO OPERACIONES ---");
    ambulancia.iniciarOperacion();
    System.out.println();
    patrulla.iniciarOperacion();
    System.out.println();
    bomberos.iniciarOperacion();
}
}
