package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Zoltan Altfatter
 * @soundtrack 'Till I Collapse - Eminem
 */
public class DutchGreetingService implements GreetingService {

    private static final Logger logger = LoggerFactory.getLogger(DutchGreetingService.class);

    public DutchGreetingService() {
        logger.info("DutchGreetingService instantiated");
    }

    @Override
    public String greet() {
        return "Hoi";
    }
}
