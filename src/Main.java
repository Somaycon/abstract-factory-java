import factories.ModernoFactory;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(new ModernoFactory());
        client.printMoveis();
    }
}