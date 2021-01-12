package pe.isil;

public class App {

    public static void main(String[] args) {

        Person persona = new Person();
        persona.setDni("012345678");
        persona.setName("Juan");
        persona.setLastName("Perez");
        persona.setAge(25);

        System.out.println("persona = " + persona);


    }

}

