package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

<<<<<<< HEAD
/**
 * Created by jt on 12/26/19.
 */
=======
>>>>>>> master
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

<<<<<<< HEAD
    @Qualifier("setterInjectedGreetingService")
    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
=======
    @Autowired
    @Qualifier("setterInjectedGreetingService")
    public void setGreetingService( GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
>>>>>>> master
        return greetingService.sayGreeting();
    }
}
