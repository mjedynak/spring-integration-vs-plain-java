package pl.mjedynak.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        MessageChannel channel = context.getBean("messageChannel", MessageChannel.class);
        channel.send(MessageBuilder.withPayload("{'json'}").build());
        channel.send(MessageBuilder.withPayload("<?xml/>").build());
    }
}
