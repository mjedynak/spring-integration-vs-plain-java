package pl.mjedynak.spring;

import org.springframework.integration.annotation.Router;
import org.springframework.stereotype.Component;

@Component
public class MessageRouter {

    @Router
    public String route(String message) {
       return message.startsWith("<?xml") ? "XMLChannel" : "JSONChannel";
    }

}
