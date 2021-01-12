package pe.isil;

public class Student implements IPerson{
    @Override
    public void sayHello() {
        System.out.println("Hi, I'm a Student!");
    }
}
