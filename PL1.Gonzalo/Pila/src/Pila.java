public class Pila implements Interfaz {

    private Nodo cima; // nodo superior de la pila

    public Pila() {
        cima = null;
    }

    @Override
    public void apilar(Artista artista) {
        Nodo nuevo = new Nodo(artista);
        nuevo.siguiente = cima;
        cima = nuevo;
    }

    @Override
    public Artista desapilar() {
        if (estaVacia()) return null;

        Artista dato = cima.dato;
        cima = cima.siguiente;
        return dato;
    }

    @Override
    public Artista cima() {
        if (estaVacia()) return null;
        return cima.dato;
    }

    @Override
    public boolean estaVacia() {
        return cima == null;
    }

    @Override
    public void mostrar() {
        Nodo actual = cima;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}
