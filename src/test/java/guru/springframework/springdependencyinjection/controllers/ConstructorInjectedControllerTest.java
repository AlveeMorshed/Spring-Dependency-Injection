package guru.springframework.springdependencyinjection.controllers;

import guru.springframework.springdependencyinjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjController;

    @BeforeEach
    void setUp() {

        constructorInjController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjController.getGreeting());
    }
}