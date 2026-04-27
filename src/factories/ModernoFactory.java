package factories;

import interfaces.AbstractFactory;
import interfaces.CadeiraInterface;
import interfaces.MesaDeCentroInterface;
import interfaces.SofaInterface;

public class ModernoFactory implements AbstractFactory {
    @Override
    public CadeiraInterface criarCadeira() {
        return null;
    }

    @Override
    public MesaDeCentroInterface criarMesaDeCentro() {
        return null;
    }

    @Override
    public SofaInterface criarSofa() {
        return null;
    }
}
