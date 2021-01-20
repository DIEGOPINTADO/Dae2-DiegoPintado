package pe.isil.famosos;

import pe.isil.vehiculos.Ivehiculo;
import pe.isil.vehiculos.Jet;

public class Sylvester_Stallone_DI {

private Ivehiculo vehiculo ;

    public Sylvester_Stallone_DI(){
    }
    //Inyeccion de dependencia por constructor
    public Sylvester_Stallone_DI(Ivehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    //Inyeccion de dependencia por setter
    public void setVehiculo(Ivehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void showVehiculo(){
     vehiculo.showVehiculo();
    }



}
