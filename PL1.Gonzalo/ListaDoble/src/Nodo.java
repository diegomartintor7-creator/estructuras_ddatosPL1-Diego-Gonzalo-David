public class Nodo {
    Artista dato;
    Nodo siguiente;
    Nodo anterior;

    public Nodo(Artista dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}