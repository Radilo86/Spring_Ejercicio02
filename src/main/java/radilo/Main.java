package radilo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String args[]){

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // NotificationService notificacion = (NotificationService)context.getBean("notificationservice");

        // El id del bean por defecto es la primera letra de la clase en minuscula y el resto igual.
        UserService servicio = (UserService) context.getBean("userService");

        System.out.println(servicio.saludo.saludoNotificacion());

    }

}
