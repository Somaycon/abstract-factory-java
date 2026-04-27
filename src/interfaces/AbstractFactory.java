package interfaces;

public interface AbstractFactory {
    CadeiraInterface criarCadeira();

    MesaDeCentroInterface criarMesaDeCentro();

    SofaInterface criarSofa();
}
