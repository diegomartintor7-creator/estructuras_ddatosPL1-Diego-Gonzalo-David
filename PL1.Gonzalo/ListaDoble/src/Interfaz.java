public interface Interfaz {

    // añadir un artista al final
    void agregar(Artista artista);

    // mostrar de inicio a fin
    void mostrarAdelante();

    // mostrar de fin a inicio
    void mostrarAtras();

    // buscar un artista por nombre
    Artista buscar(String nombre);

    // eliminar un artista por nombre
    void eliminar(String nombre);
}