package p69.prototype;

/**
 * Prototipo abstracto de un jugador. Conserva la configuración común de una
 * selección y permite crear copias mediante {@link #clonar()}.
 */
public abstract class Jugador {

    private String nombre;
    private int numero;
    private final String nacionalidad;
    private final String colorCamiseta;
    private String posicion;

    protected Jugador(String nacionalidad, String colorCamiseta) {
        this.nacionalidad = nacionalidad;
        this.colorCamiseta = colorCamiseta;
    }

    protected Jugador(Jugador prototipo) {
        this.nombre = prototipo.nombre;
        this.numero = prototipo.numero;
        this.nacionalidad = prototipo.nacionalidad;
        this.colorCamiseta = prototipo.colorCamiseta;
        this.posicion = prototipo.posicion;
    }

    public abstract Jugador clonar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre es obligatorio");
        }
        this.nombre = nombre.trim();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número debe ser mayor que cero");
        }
        this.numero = numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getColorCamiseta() {
        return colorCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        if (posicion == null || posicion.trim().isEmpty()) {
            throw new IllegalArgumentException("La posición es obligatoria");
        }
        this.posicion = posicion.trim();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "nombre='" + nombre + '\'' +
                ", numero=" + numero +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", colorCamiseta='" + colorCamiseta + '\'' +
                ", posicion='" + posicion + '\'' +
                '}';
    }
}
