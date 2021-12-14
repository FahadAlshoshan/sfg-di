package guru.springframework.sfgdi.controllers;

<<<<<<< HEAD
import guru.springframework.sfgdi.services.ConstructorGreetingService;
=======
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
>>>>>>> master
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
<<<<<<< HEAD
        controller.setGreetingService(new ConstructorGreetingService());
=======
        controller.setGreetingService(new ConstructorInjectedGreetingService());
>>>>>>> master
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
<<<<<<< HEAD

=======
>>>>>>> master
    }
}