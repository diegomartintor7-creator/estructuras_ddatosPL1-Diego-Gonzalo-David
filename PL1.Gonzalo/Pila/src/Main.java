public class Main {
    public static void main(String[] args) {

        Pila pilaArtistas = new Pila();

        // Crear artistas
        Artista a1 = new Artista("Bad Bunny", "Reggaeton", 6);
        Artista a2 = new Artista("Rosalia", "Pop", 3);
        Artista a3 = new Artista("Quevedo", "Urbano", 2);

        // Apilar artistas
        pilaArtistas.apilar(a1);
        pilaArtistas.apilar(a2);
        pilaArtistas.apilar(a3);

        // Mostrar pila
        System.out.println("Pila de artistas (de cima a base):");
        pilaArtistas.mostrar();

        // Desapilar un artista
        System.out.println("\nDesapilando un artista...");
        Artista eliminado = pilaArtistas.desapilar();
        System.out.println("Eliminado: " + eliminado);

        // Mostrar pila después de desapilar
        System.out.println("\nPila después de desapilar:");
        pilaArtistas.mostrar();

        // Mostrar la cima sin eliminar
        System.out.println("\nArtista en la cima:");
        System.out.println(pilaArtistas.cima());
    }
}
