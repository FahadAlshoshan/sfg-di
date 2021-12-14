package guru.springframework.sfgdi.controllers;

<<<<<<< HEAD
import guru.springframework.sfgdi.services.ConstructorGreetingService;
=======
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
>>>>>>> master
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
<<<<<<< HEAD

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());

    }
=======
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
    controller = new ConstructorInjectedController(new ConstructorInjectedGreetingService());
    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }

>>>>>>> master
}