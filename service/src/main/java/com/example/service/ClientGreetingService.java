package com.example.service;

/**
 * @author Zoltan Altfatter
 * @soundtrack 0 To 100 / The Catch Up - Drake
 */
public class ClientGreetingService {

    private GreetingService greetingService;

    public ClientGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(String name) {
       return greetingService.greet() + " " + name;
    }

}
