public interface Interfaz {
    // agregar un artista al final de la cola
    void encolar(Artista artista);

    // eliminar y devolver el artista del frente de la cola
    Artista desencolar();

    // ver el artista al frente sin eliminarlo
    Artista frente();

    // comprobar si la cola está vacía
    boolean estaVacia();

    // mostrar todos los artistas en la cola
    void mostrar();
}
