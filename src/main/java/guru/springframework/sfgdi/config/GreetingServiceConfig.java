package guru.springframework.sfgdi.config;

import com.springframework.pets.CatPetService;
import com.springframework.pets.PetService;
import com.springframework.pets.PetServiceFactory;
import guru.springframework.sfgdi.datasource.FakeDataSource;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import guru.springframework.sfgdi.repositories.EnglishGreetingRepositoryImpl;
import guru.springframework.sfgdi.services.ConstructorGreetingService;
import guru.springframework.sfgdi.services.I18NSpanishService;
import guru.springframework.sfgdi.services.I18nEnglishGreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import guru.springframework.sfgdi.services.PropertyInjectedGreetingService;
import guru.springframework.sfgdi.services.SetterInjectedGreetingService;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(SfgConstructorConfig.class)
@ImportResource("classpath:sfgdi-config.xml")
@Configuration
public class GreetingServiceConfig {

  @Bean
  FakeDataSource fakeDataSource(SfgConstructorConfig sfgConstructorConfig) {
    FakeDataSource fakeDataSource = new FakeDataSource();
    fakeDataSource.setJdbcurl(sfgConstructorConfig.getJdbcurl());
    fakeDataSource.setUsername(sfgConstructorConfig.getUsername());
    fakeDataSource.setPassword(sfgConstructorConfig.getPassword());
    return fakeDataSource;
  }

  @Profile({"ES", "default"})
  @Bean("i18nService")
  I18NSpanishService i18NSpanishService() {
    return new I18NSpanishService();
  }

  @Profile("EN")
  @Bean("i18nService")
  I18nEnglishGreetingService i18nEnglishGreetingService(
      EnglishGreetingRepository englishGreetingRepository) {
    return new I18nEnglishGreetingService(englishGreetingRepository);
  }

  @Primary
  @Bean
  PrimaryGreetingService primaryGreetingService() {
    return new PrimaryGreetingService();
  }

  // @Bean
  ConstructorGreetingService constructorGreetingService() {
    return new ConstructorGreetingService();
  }

  @Bean
  PropertyInjectedGreetingService propertyInjectedGreetingService() {
    return new PropertyInjectedGreetingService();
  }

  @Bean
  SetterInjectedGreetingService setterInjectedGreetingService() {
    return new SetterInjectedGreetingService();
  }

  @Bean
  EnglishGreetingRepository englishGreetingRepository() {
    return new EnglishGreetingRepositoryImpl();
  }

  /****************PETS*******************/
  @Bean
  PetServiceFactory petServiceFactory() {
    return new PetServiceFactory();
  }

  @Profile({"Cat", "default"})
  @Bean
  CatPetService catPetService(PetServiceFactory petServiceFactory) {
    return (CatPetService) petServiceFactory.getPetService("cat");
  }

  @Profile({"Dog"})
  @Bean
  PetService dogPetService() {
    return petServiceFactory().getPetService("dog");
  }
}
