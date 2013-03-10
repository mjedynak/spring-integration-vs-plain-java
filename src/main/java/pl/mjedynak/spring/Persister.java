package pl.mjedynak.spring;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;

@Component
public class Persister {

    @ServiceActivator
    public void persist(String message) {
        System.out.println("persisting " + message);
    }
}
