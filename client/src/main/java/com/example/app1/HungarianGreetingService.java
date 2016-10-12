package com.example.app1;

import com.example.service.GreetingService;
import org.springframework.stereotype.Service;

/**
 * @author Zoltan Altfatter
 * @soundtrack One Dance - Drake
 */
@Service
public class HungarianGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Szia";
    }
}
