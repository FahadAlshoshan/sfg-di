package guru.springframework.sfgdi.services;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
public class SetterInjectedGreetingService implements GreetingService{
=======
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterInjectedGreetingService implements GreetingService {
>>>>>>> master
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
