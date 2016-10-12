package com.example.app1;

import com.example.app2.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author Zoltan Altfatter
 * @soundtrack One Dance - Drake
 */
@Primary
@Service("greetingService")
public class HungarianGreetingService implements GreetingService {

    public HungarianGreetingService() {
        System.out.println("hungarian greeting service was instantiated...");
    }

    @Override
    public String greet() {
        return "Szia";
    }
}
