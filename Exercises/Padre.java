package Exercises;

public class Padre {
    private final String apellido;

    public Padre(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean test() {
        Hijo hijo = new Hijo("Juan", apellido);
        EspirituSanto espiritu = new EspirituSanto(hijo.getNombre(), apellido, "Lopez");
        return espiritu.pruebaPaternidad();
    }
}