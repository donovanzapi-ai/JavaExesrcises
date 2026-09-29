package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Colecciones {
    private List<String> cars ;
    private String[] bikes;
    private Set<String> bicicles;
    public Map<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<>();
        this.transport= new HashMap<>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[0]="Yamaha V-Star 250";
        this.bikes[1]="Royal Enfield Meteor 350";
        this.bikes[2]="Kawasaki Eliminator";
        this.bikes[3]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

    public Map<Integer, String>  obtenerHash(){
        Set<String> vehicles = new LinkedHashSet<>();
        vehicles.addAll(cars);
        for (String bike : bikes) {
            vehicles.add(bike);
        }
        vehicles.addAll(bicicles);

        transport.clear();
        int count =1;

        for (String vehicle : vehicles) {
            if (vehicle != null && !vehicle.trim().isEmpty()) {
                transport.put(count++, vehicle);
            }
        }
        //this.transport.forEach((key, value) -> System.out.println(key + " " + value)); //imprimir para pruebas
        return this.transport;
    }
}
