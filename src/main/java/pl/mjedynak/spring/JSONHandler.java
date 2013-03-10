package pl.mjedynak.spring;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class JSONHandler {

    @ServiceActivator
    public String process(String message) {
        System.out.println("Processing json message: " + message);
        return message;
    }
}
