public class ListaCircular implements Interfaz {

    private Nodo cabeza; // primer nodo
    private Nodo cola;   // último nodo para mantener circularidad

    public ListaCircular() {
        cabeza = null;
        cola = null;
    }

    @Override
    public void agregar(Artista artista) {
        Nodo nuevo = new Nodo(artista);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza; // circularidad
        } else {
            cola.siguiente = nuevo;
            cola = nuevo;
            cola.siguiente = cabeza; // mantener circularidad
        }
    }

    @Override
    public void mostrar() {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        do {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        } while (actual != cabeza);
    }

    @Override
    public Artista buscar(String nombre) {
        if (cabeza == null) return null;

        Nodo actual = cabeza;
        do {
            if (actual.dato.getNombre().equals(nombre)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);

        return null;
    }

    @Override
    public void eliminar(String nombre) {
        if (cabeza == null) return;

        Nodo actual = cabeza;
        Nodo anterior = cola;
        boolean encontrado = false;

        do {
            if (actual.dato.getNombre().equals(nombre)) {
                encontrado = true;
                break;
            }
            anterior = actual;
            actual = actual.siguiente;
        } while (actual != cabeza);

        if (!encontrado) return;

        // eliminar único nodo
        if (actual == cabeza && actual == cola) {
            cabeza = null;
            cola = null;
        }
        // eliminar cabeza
        else if (actual == cabeza) {
            cabeza = cabeza.siguiente;
            cola.siguiente = cabeza;
        }
        // eliminar cola
        else if (actual == cola) {
            cola = anterior;
            cola.siguiente = cabeza;
        }
        // eliminar nodo intermedio
        else {
            anterior.siguiente = actual.siguiente;
        }
    }
}
