package Exercises;

public class Profesor extends Sobrecarga {
    public Profesor(String nombre, String materia, int calificacion) {
        super(nombre, materia, calificacion);
    }

    @Override
    public String reprobar() {
        if (getCalificacion() < 6) {
            return ":(";
        }
        return ">:) Sacaste " + getCalificacion() + " en " + getMateria();
    }
}