package com.example.service2;

import com.example.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Zoltan Altfatter
 */

public class GermanGreetingService implements GreetingService {

    private static final Logger logger = LoggerFactory.getLogger(GermanGreetingService.class);

    public GermanGreetingService() {
        logger.info("GermanGreetingService instantiated");
    }

    @Override
    public String greet() {
        return "Hallo";
    }
}
