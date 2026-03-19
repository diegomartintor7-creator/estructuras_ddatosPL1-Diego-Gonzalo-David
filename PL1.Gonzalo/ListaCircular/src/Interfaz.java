public interface Interfaz {
    void agregar(Artista artista);       // agregar al final
    void mostrar();                       // mostrar todos los artistas una vez
    Artista buscar(String nombre);        // buscar por nombre
    void eliminar(String nombre);         // eliminar por nombre
}
