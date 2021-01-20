package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Comas comas = app.getBean("comas", Comas.class);
        comas.sayHello();

        LaMolina la_molina = app.getBean("la_Molina", LaMolina.class);
        la_molina.sayHello();
    }
}
