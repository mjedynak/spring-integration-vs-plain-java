package pl.mjedynak.spring;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.MessageChannel;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class AppIntegrationTest {

    @Autowired
    private MessageChannel messageChannel;

    @Autowired
    private MessageRouter messageRouter;
    @Autowired
    private JSONHandler jsonHandler;
    @Autowired
    private XMLHandler xmlHandler;
    @Autowired
    private Persister persister;

    @Before
    public void resetMocks() {
        reset(messageRouter, jsonHandler, xmlHandler, persister);
    }

    @Test
    public void shouldRouteToPersisterViaJSONHandler() {
        String message = "json message";
        given(messageRouter.route(message)).willReturn("JSONChannel");
        given(jsonHandler.process(message)).willReturn(message);

        messageChannel.send(MessageBuilder.withPayload(message).build());

        verify(persister).persist(message);
    }
}
