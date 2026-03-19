// representa un artista musical con nombre, genero y numero de albumes
public class Artista {

    private String nombre;
    private String genero;
    private int albumes;

    // constructor para inicializar todos los datos del artista
    public Artista(String nombre, String genero, int albumes) {
        this.nombre = nombre;
        this.genero = genero;
        this.albumes = albumes;
    }

    // devuelve el nombre del artista
    public String getNombre() {
        return nombre;
    }

    // devuelve el genero musical
    public String getGenero() {
        return genero;
    }

    // devuelve el número de álbumes
    public int getAlbumes() {
        return albumes;
    }

    // representación del artista
    @Override
    public String toString() {
        return "Artista: " + nombre + " | Genero: " + genero + " | Albumes: " + albumes;
    }
}