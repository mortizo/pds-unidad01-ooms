package p69.singleton;

/** Ejecuta una demostración académica del patrón Singleton. */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        ContadorVisita contador = ContadorVisita.getInstance();
        AppMovil appMovil = new AppMovil();
        PortalWeb portalWeb = new PortalWeb();

        appMovil.realizarVisita();
        portalWeb.realizarVisita();
        appMovil.realizarVisita();

        System.out.println("Visitas totales: " + contador.getValor());
        System.out.println("Misma instancia: "
                + (contador == ContadorVisita.getInstance()));
    }
}
