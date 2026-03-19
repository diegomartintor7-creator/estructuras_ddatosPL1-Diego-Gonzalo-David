public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // crear artistas
        Artista a1 = new Artista("Bad Bunny", "Reggaeton", 6);
        Artista a2 = new Artista("Rosalia", "Pop", 3);
        Artista a3 = new Artista("Quevedo", "Urbano", 2);

        // añadir a la lista
        lista.agregar(a1);
        lista.agregar(a2);
        lista.agregar(a3);

        // mostrar lista
        System.out.println("Lista de artistas:");
        lista.mostrar();

        // buscar
        System.out.println("\nBuscando a Rosalia:");
        System.out.println(lista.buscar("Rosalia"));

        // eliminar
        System.out.println("\nEliminando a Quevedo...");
        lista.eliminar("Quevedo");

        // mostrar de nuevo
        lista.mostrar();
    }
}
