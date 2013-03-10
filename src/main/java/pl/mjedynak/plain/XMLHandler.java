package pl.mjedynak.plain;

public class XMLHandler {
    private Persister persister = new Persister();

    public void process(String message) {
        System.out.println("Processing xml message: " + message);
        persister.persist(message);
    }
}
