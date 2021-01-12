package pe.isil;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSpring {

    public static void main(String[] args) {

        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher teacher = app.getBean("teacher", Teacher.class);
        teacher.sayHello();

        Student student = app.getBean("student", Student.class);
        student.sayHello();

    }


}
