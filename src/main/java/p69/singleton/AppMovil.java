package p69.singleton;

/** Canal móvil que registra visitas en el contador compartido. */
public final class AppMovil {

    public int realizarVisita() {
        return ContadorVisita.getInstance().registrarVisita();
    }
}
