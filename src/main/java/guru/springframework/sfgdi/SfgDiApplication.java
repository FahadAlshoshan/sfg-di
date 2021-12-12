package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.ConstructorInjectedController;
import guru.springframework.sfgdi.controllers.I18nController;
import guru.springframework.sfgdi.controllers.MyController;
import guru.springframework.sfgdi.controllers.PropertyInjectedController;
import guru.springframework.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

    I18nController i18nController = (I18nController) ctx.getBean("i18nController");
    System.out.println(i18nController.sayHello());

    System.out.println("----- MyController -----");
    System.out.println(((MyController) ctx.getBean("myController")).sayHello());

    System.out.println("----- Property -----");
    System.out.println(
        ((PropertyInjectedController) ctx.getBean("propertyInjectedController")).getGreeting());

    System.out.println("----- Setter -----");
    System.out.println(
        ((SetterInjectedController) ctx.getBean("setterInjectedController")).getGreeting());

    System.out.println("----- Constructor -----");
    System.out.println(
        ((ConstructorInjectedController) ctx.getBean("constructorInjectedController"))
            .getGreeting());
  }
}
