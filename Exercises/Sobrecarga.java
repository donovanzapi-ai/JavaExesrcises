package Exercises;

public class Sobrecarga {
    private final String nombre;
    private final String materia;
    private final int calificacion;

    public Sobrecarga(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    protected String getNombre() {
        return nombre;
    }

    protected String getMateria() {
        return materia;
    }

    protected int getCalificacion() {
        return calificacion;
    }

    public String reprobar() {
        return calificacion > 5 ? "true" : "false";
    }
}