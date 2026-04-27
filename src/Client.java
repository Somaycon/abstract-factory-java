import interfaces.AbstractFactory;

public class Client {
 private AbstractFactory factory;

    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    void printMoveis(){
        System.out.println(factory.criarCadeira().descCadeira());
        System.out.println(factory.criarMesaDeCentro().descMesaDeCentro());
        System.out.println(factory.criarSofa().descSofa());
    }
}
