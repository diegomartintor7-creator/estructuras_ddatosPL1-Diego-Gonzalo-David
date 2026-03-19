public interface Interfaz {

    // añadir un artista a la pila
    void apilar(Artista artista);

    // eliminar y devolver el artista de la cima
    Artista desapilar();

    // ver el artista en la cima sin eliminarlo
    Artista cima();

    // comprobar si la pila está vacía
    boolean estaVacia();

    // mostrar todos los artistas de cima a base
    void mostrar();
}