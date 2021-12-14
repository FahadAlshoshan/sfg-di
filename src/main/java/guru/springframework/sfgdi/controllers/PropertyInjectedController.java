package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
/**
 * Created by jt on 12/26/19.
 */
@Controller
public class PropertyInjectedController {

    @Qualifier("propertyInjectedGreetingService")
    @Autowired
    public GreetingService greetingService;
=======
@Controller
public class PropertyInjectedController {

    @Autowired

    public @Qualifier("propertyInjectedGreetingService") GreetingService greetingService;
>>>>>>> master

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
<<<<<<< HEAD

=======
>>>>>>> master
}
