public class Main {
    public static void main(String[] args) {

        ListaCircular lista = new ListaCircular();

        // Crear artistas
        Artista a1 = new Artista("Bad Bunny", "Reggaeton", 6);
        Artista a2 = new Artista("Rosalia", "Pop", 3);
        Artista a3 = new Artista("Quevedo", "Urbano", 2);

        // Agregar artistas a la lista
        lista.agregar(a1);
        lista.agregar(a2);
        lista.agregar(a3);

        // Mostrar lista
        System.out.println("Lista circular de artistas:");
        lista.mostrar();

        // Buscar un artista
        System.out.println("\nBuscando Rosalia:");
        Artista buscado = lista.buscar("Rosalia");
        System.out.println(buscado != null ? "Encontrado: " + buscado : "No encontrado");

        // Eliminar un artista
        System.out.println("\nEliminando Quevedo...");
        lista.eliminar("Quevedo");

        // Mostrar lista después de eliminar
        System.out.println("Lista después de eliminar:");
        lista.mostrar();

        // Agregar un nuevo artista
        System.out.println("\nAgregando Shakira...");
        lista.agregar(new Artista("Shakira", "Pop", 11));

        // Mostrar lista final
        System.out.println("Lista final:");
        lista.mostrar();
    }
}
