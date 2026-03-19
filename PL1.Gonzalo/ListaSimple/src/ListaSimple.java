public class ListaSimple implements Interfaz {

    private Nodo cabeza; // primer nodo de la lista

    // constructor (lista vacía)
    public ListaSimple() {
        cabeza = null;
    }

    // Añadir al final
    @Override
    public void agregar(Artista artista) {
        Nodo nuevo = new Nodo(artista);

        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    // Mostrar la lista
    @Override
    public void mostrar() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    // Buscar por nombre
    @Override
    public Artista buscar(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {
            if (actual.dato.getNombre().equals(nombre)) {
                return actual.dato;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    // Eliminar por nombre
    @Override
    public void eliminar(String nombre) {
        if (cabeza == null) return;

        // si el primero es el que queremos borrar
        if (cabeza.dato.getNombre().equals(nombre)) {
            cabeza = cabeza.siguiente;
            return;
        }

        Nodo actual = cabeza;

        while (actual.siguiente != null) {
            if (actual.siguiente.dato.getNombre().equals(nombre)) {
                actual.siguiente = actual.siguiente.siguiente;
                return;
            }
            actual = actual.siguiente;
        }
    }
}