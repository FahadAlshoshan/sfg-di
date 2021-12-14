package guru.springframework.sfgdi.services;

<<<<<<< HEAD
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
=======
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Primary Bean";
>>>>>>> master
    }
}
