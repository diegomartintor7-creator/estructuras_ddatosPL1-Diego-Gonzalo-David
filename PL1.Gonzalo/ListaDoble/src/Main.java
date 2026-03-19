public class Main {
    public static void main(String[] args) {

        ListaDoble lista = new ListaDoble();

        lista.agregar(new Artista("Bad Bunny", "Reggaeton", 6));
        lista.agregar(new Artista("Rosalia", "Pop", 3));
        lista.agregar(new Artista("Quevedo", "Urbano", 2));

        System.out.println("Recorrido hacia adelante:");
        lista.mostrarAdelante();

        System.out.println("\nRecorrido hacia atrás:");
        lista.mostrarAtras();

        System.out.println("\nBuscando Rosalia:");
        System.out.println(lista.buscar("Rosalia"));

        System.out.println("\nEliminando Rosalia...");
        lista.eliminar("Rosalia");

        lista.mostrarAdelante();
    }
}
