package guru.springframework.springdependencyinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary //@Primary annotation gets precedence over all other eligible beans or Service beans in this case
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World-PRIMARY";
    }
}
