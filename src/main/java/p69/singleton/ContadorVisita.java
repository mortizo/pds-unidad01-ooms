package p69.singleton;

/**
 * Singleton que mantiene un contador de visitas compartido por toda la
 * aplicación.
 */
public final class ContadorVisita {

    private static final ContadorVisita instance = new ContadorVisita();

    private int valor;

    private ContadorVisita() {
    }

    public static ContadorVisita getInstance() {
        return instance;
    }

    public synchronized int registrarVisita() {
        return registrarVisitas(1);
    }

    public synchronized int registrarVisitas(int cantidad) {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor que cero");
        }
        valor += cantidad;
        return valor;
    }

    public synchronized int getValor() {
        return valor;
    }

    synchronized void reiniciar() {
        valor = 0;
    }
}
