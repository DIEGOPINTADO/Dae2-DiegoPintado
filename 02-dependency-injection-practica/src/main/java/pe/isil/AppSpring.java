package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.famosos.Sylvester_Stallone_DI;

public class AppSpring {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sylvester_Stallone_DI sylvester_stallone = appContext.getBean("sylvester_stallone", Sylvester_Stallone_DI.class);
        sylvester_stallone.showVehiculo();
    }
}
