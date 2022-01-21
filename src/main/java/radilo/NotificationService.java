package radilo;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService() {
    }

    public String saludoNotificacion(){
        return "Hola desde NotificacionService";
    }

}
