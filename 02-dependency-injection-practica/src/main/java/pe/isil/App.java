package pe.isil;

import pe.isil.famosos.Sylvelter_Stallone;
import pe.isil.famosos.Sylvester_Stallone_DI;
import pe.isil.vehiculos.Ferrari;
import pe.isil.vehiculos.Helicoptero;
import pe.isil.vehiculos.Jet;

public class App {

    public static void main(String[] args) {

        //Inyeccion de dependencia por constructor
        Sylvester_Stallone_DI rocky = new Sylvester_Stallone_DI(new Helicoptero());

        //Inyeccion de dependencia por setter
        //rocky.setVehiculo(new Helicoptero());


        rocky.showVehiculo();
    }
}
