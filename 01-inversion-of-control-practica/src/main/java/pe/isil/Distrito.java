package pe.isil;

public class Distrito {

    private String nombre_Distrito;
    private String ubicacion;
    private int poblacion;

    public String getNombre_Distrito() {
        return nombre_Distrito;
    }

    public void setNombre_Distrito(String nombre_Distrito) {
        this.nombre_Distrito = nombre_Distrito;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Distrito{" +
                "nombre_Distrito='" + nombre_Distrito + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }
}
