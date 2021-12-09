package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class I18nArabicService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Ahla - AR";
    }
}
