package pe.isil;

public class App {

    public static void main(String[] args) {
         Distrito distrito = new Distrito();
         distrito.setNombre_Distrito("La Victoria");
         distrito.setPoblacion(23450);
         distrito.setUbicacion("Lima");

        System.out.println("Distrito: "+distrito.toString());
    }
}
