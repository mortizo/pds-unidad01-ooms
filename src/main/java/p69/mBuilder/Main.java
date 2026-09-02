package p69.mBuilder;

/** Ejecuta una demostración de la variante moderna del patrón Builder. */
public final class Main {

    private Main() {
    }

    public static void main(String[] args) {
        Persona personaCompleta = new PersonaBuilder()
                .conId(1)
                .conNombre("Ana")
                .conApellido("Torres")
                .conEdad(28)
                .construir();

        Persona personaSinOpcionales = new PersonaBuilder()
                .conId(2)
                .conNombre("Luis")
                .construir();

        System.out.println(personaCompleta);
        System.out.println(personaSinOpcionales);
    }
}
