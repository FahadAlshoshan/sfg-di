package guru.springframework.sfgdi.controllers;

<<<<<<< HEAD
import guru.springframework.sfgdi.services.ConstructorGreetingService;
=======
import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
>>>>>>> master
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;
<<<<<<< HEAD

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {

=======
    @BeforeEach
    void setUp(){
        controller = new PropertyInjectedController();
        controller.greetingService =new ConstructorInjectedGreetingService();
    }
    @Test
    void getGreeting() {
>>>>>>> master
        System.out.println(controller.getGreeting());
    }
}