package radilo;

import org.springframework.stereotype.Component;

@Component
public class UserService {

    NotificationService saludo;

    public UserService(NotificationService saludo) {
        this.saludo = saludo;
    }
}
