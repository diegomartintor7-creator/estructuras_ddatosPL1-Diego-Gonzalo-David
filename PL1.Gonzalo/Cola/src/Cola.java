public class Cola implements Interfaz {

    private Nodo frente;
    private Nodo fin;

    public Cola() {
        frente = null;
        fin = null;
    }

    @Override
    public void encolar(Artista artista) {
        Nodo nuevo = new Nodo(artista);

        if (estaVacia()) {
            frente = nuevo;
            fin = nuevo;
        } else {
            fin.siguiente = nuevo;
            fin = nuevo;
        }
    }

    @Override
    public Artista desencolar() {
        if (estaVacia()) {
            return null;
        }

        Artista dato = frente.dato;
        frente = frente.siguiente;

        if (frente == null) {
            fin = null; // la cola queda vacía
        }

        return dato;
    }

    @Override
    public Artista frente() {
        if (estaVacia()) return null;
        return frente.dato;
    }

    @Override
    public boolean estaVacia() {
        return frente == null;
    }

    @Override
    public void mostrar() {
        Nodo actual = frente;
        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }
}