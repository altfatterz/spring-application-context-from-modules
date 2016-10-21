package com.example.service;

/**
 * @author Zoltan Altfatter
 */
public class GreetingServiceClient {

    private GreetingService greetingService;

    public GreetingServiceClient(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(String name) {
       return greetingService.greet() + " " + name;
    }

}
