package com.example.service2;

import com.example.service.GreetingService;

/**
 * @author Zoltan Altfatter
 */

public class GermanGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hallo";
    }
}
