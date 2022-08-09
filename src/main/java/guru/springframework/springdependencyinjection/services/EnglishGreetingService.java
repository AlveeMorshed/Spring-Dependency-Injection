package guru.springframework.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile({"EN", "default"})
@Service("i18nService")
public class EnglishGreetingService implements GreetingService{


    @Override
    public String sayGreeting() {
        return "Hello World - English";
    }
}
