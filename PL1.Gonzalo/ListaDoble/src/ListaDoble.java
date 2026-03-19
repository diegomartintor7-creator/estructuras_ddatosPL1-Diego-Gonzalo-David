public class ListaDoble implements Interfaz {

    private Nodo cabeza;
    private Nodo cola;

    public ListaDoble() {
        cabeza = null;
        cola = null;
    }

    @Override
    public void agregar(Artista artista) {
        Nodo nuevo = new Nodo(artista);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;
        }
    }

    @Override
    public void mostrarAdelante() {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.siguiente;
        }
    }

    @Override
    public void mostrarAtras() {
        Nodo actual = cola;

        while (actual != null) {
            System.out.println(actual.dato);
            actual = actual.anterior;
        }
    }

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

    @Override
    public void eliminar(String nombre) {
        Nodo actual = cabeza;

        while (actual != null) {

            if (actual.dato.getNombre().equals(nombre)) {

                // caso 1: eliminar cabeza
                if (actual == cabeza) {
                    cabeza = actual.siguiente;

                    if (cabeza != null) {
                        cabeza.anterior = null;
                    } else {
                        cola = null;
                    }
                }

                // caso 2: eliminar cola
                else if (actual == cola) {
                    cola = actual.anterior;
                    cola.siguiente = null;
                }

                // caso 3: nodo intermedio
                else {
                    actual.anterior.siguiente = actual.siguiente;
                    actual.siguiente.anterior = actual.anterior;
                }

                return;
            }

            actual = actual.siguiente;
        }
    }
}
