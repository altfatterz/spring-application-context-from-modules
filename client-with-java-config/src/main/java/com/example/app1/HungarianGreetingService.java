package com.example.app1;

import com.example.service.GreetingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Zoltan Altfatter
 */
public class HungarianGreetingService implements GreetingService {

    private static final Logger logger = LoggerFactory.getLogger(HungarianGreetingService.class);

    public HungarianGreetingService() {
        logger.info("HungarianGreetingService instantiated");
    }

    @Override
    public String greet() {
        return "Szia";
    }
}
