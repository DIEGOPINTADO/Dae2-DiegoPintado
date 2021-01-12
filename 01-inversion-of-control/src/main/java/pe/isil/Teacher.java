package pe.isil;

public class Teacher implements IPerson{
    @Override
    public void sayHello() {
        System.out.println("Hi, I'm a Teacher!");
    }
}
