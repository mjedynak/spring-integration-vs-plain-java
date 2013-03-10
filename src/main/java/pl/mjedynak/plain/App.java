package pl.mjedynak.plain;

public class App {

    public static void main(String[] args) {
        MessageRouter consumer = new MessageRouter();
        consumer.route("{'json'}");
        consumer.route("<?xml/>");
    }
}
