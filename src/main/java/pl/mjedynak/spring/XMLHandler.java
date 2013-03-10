package pl.mjedynak.spring;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class XMLHandler {

    @ServiceActivator
    public String process(String message) {
        System.out.println("Processing xml message: " + message);
        return message;
    }
}
