package Exercises;

// Clase base representativa
public class Persona {
    private String nombre;
    private String materia;
    private int calificacion;

    public Persona(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    // Getters
    public String getNombre() { return nombre; }
    public String getMateria() { return materia; }
    public int getCalificacion() { return calificacion; }

    public String reprobar() {
        return this.calificacion <= 5 ? "Reprobado" : "Aprobado";
    }
}

// Subclase Profesor en su propio ámbito
class ProfesorPersona extends Persona {
    public ProfesorPersona(String nombre, String materia, int calificacion) {
        super(nombre, materia, calificacion);
    }

    @Override
    public String reprobar() {
        if (getCalificacion() <= 5) {
            return ":( Reprobaste " + getMateria();
        } else {
            return ">:) Sacaste " + getCalificacion() + " en " + getMateria();
        }
    }
}

// Subclase Alumno en su propio ámbito
class AlumnoPersona extends Persona {
    public AlumnoPersona(String nombre, String materia, int calificacion) {
        super(nombre, materia, calificacion);
    }

    @Override
    public String reprobar() {
        if (getCalificacion() <= 5) {
            return "Voy a necesitar meter materia a extraordinario en " + getMateria();
        }
        return "Pasé la materia de " + getMateria();
    }
}
