package com.example.app;

/**
 * @author Zoltan Altfatter
 */

import com.example.service.GreetingService;

/**
 * @author Zoltan Altfatter
 */
public class HungarianGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Szia";
    }
}
