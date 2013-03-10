package pl.mjedynak.plain;

public class MessageRouter {

    private XMLHandler xmlHandler = new XMLHandler();
    private JSONHandler jsonHandler = new JSONHandler();

    public void route(String message) {
        if (message.startsWith("<?xml")) {
            xmlHandler.process(message);
        } else {
            jsonHandler.process(message);
        }
    }
}
