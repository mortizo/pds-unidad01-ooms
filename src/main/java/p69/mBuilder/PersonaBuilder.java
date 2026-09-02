package p69.mBuilder;

/**
 * Variante moderna del patrón Builder: configura una persona mediante métodos
 * encadenados y crea el producto con {@link #construir()}.
 */
public final class PersonaBuilder {

    private int id;
    private String nombre;
    private String apellido = "";
    private int edad;

    public PersonaBuilder conId(int id) {
        this.id = id;
        return this;
    }

    public PersonaBuilder conNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PersonaBuilder conApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public PersonaBuilder conEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public Persona construir() {
        if (id <= 0) {
            throw new IllegalStateException("El id debe ser mayor que cero");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalStateException("El nombre es obligatorio");
        }
        if (apellido == null) {
            throw new IllegalStateException("El apellido no puede ser nulo");
        }
        if (edad < 0) {
            throw new IllegalStateException("La edad no puede ser negativa");
        }

        return new Persona(id, nombre.trim(), apellido.trim(), edad);
    }
}
