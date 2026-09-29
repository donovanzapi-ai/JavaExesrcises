package Exercises;

import java.util.Objects;

class Hijo extends Padre{
    private String nombre;
    public Hijo(String nombre, String apellido){
        super(apellido);
        this.nombre=nombre;
    }
    public String getNombre() {
        return nombre;
    }
}
public class EspirituSanto extends Hijo {
    private String apellidoReal;
    public EspirituSanto(String nombre, String apellido, String apellidoReal){
        super(nombre, apellido);
        this.apellidoReal = apellidoReal;
    }
    public boolean pruebaPaternidad(){
        return Objects.equals(this.getApellido(), this.apellidoReal);
    }
    
}