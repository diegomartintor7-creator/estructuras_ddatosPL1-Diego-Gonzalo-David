public interface Interfaz {
    // añadir un artista al final
    void agregar(Artista artista);

    // mostrar todos los artistas
    void mostrar();

    // buscar un artista por nombre
    Artista buscar(String nombre);

    // eliminar un artista por nombre
    void eliminar(String nombre);
}