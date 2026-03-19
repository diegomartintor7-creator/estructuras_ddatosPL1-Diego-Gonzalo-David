public class Main {
    public static void main(String[] args) {

        Cola colaArtistas = new Cola();

        // Crear artistas
        Artista a1 = new Artista("Bad Bunny", "Reggaeton", 6);
        Artista a2 = new Artista("Rosalia", "Pop", 3);
        Artista a3 = new Artista("Quevedo", "Urbano", 2);

        // Encolar artistas
        colaArtistas.encolar(a1);
        colaArtistas.encolar(a2);
        colaArtistas.encolar(a3);

        // Mostrar cola
        System.out.println("Cola de artistas:");
        colaArtistas.mostrar();

        // Desencolar un artista
        System.out.println("\nDesencolando un artista...");
        Artista eliminado = colaArtistas.desencolar();
        System.out.println("Eliminado: " + eliminado);

        // Mostrar cola después de desencolar
        System.out.println("\nCola después de desencolar:");
        colaArtistas.mostrar();

        // Mostrar el frente sin eliminar
        System.out.println("\nArtista al frente de la cola:");
        System.out.println(colaArtistas.frente());
    }
}
