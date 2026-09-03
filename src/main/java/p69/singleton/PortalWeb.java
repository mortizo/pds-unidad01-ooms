package p69.singleton;

/** Canal web que registra visitas en el contador compartido. */
public final class PortalWeb {

    public int realizarVisita() {
        return ContadorVisita.getInstance().registrarVisita();
    }
}
