package pl.mjedynak.plain;

public class App {
    public static void main(String[] args) {
        MessageRouter router = new MessageRouter();
        router.route("{'json'}");
        router.route("<?xml/>");
    }
}
