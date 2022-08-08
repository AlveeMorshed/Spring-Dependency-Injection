package guru.springframework.springdependencyinjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
@Profile("BN")
@Service("i18nService")
public class BanglaGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Oow Prithibi - Bangla";
    }
}
