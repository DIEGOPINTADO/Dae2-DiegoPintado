package pe.isil.messi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pe.isil.messi.player.MessiDI;

public class AppSpring {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessiDI messi = context.getBean("messi", MessiDI.class);
        messi.showClubName();

    }

}
