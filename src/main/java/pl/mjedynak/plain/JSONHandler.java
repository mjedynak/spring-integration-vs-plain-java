package pl.mjedynak.plain;

public class JSONHandler {

    private Persister persister = new Persister();

    public void process(String message) {
        System.out.println("Processing json message: " + message);
        persister.persist(message);
    }

}
