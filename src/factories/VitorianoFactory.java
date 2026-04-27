package factories;

import interfaces.AbstractFactory;
import interfaces.CadeiraInterface;
import interfaces.MesaDeCentroInterface;
import interfaces.SofaInterface;
import interfaces.vitoriano.CadeiraVitoriano;
import interfaces.vitoriano.MesaVitoriano;
import interfaces.vitoriano.SofaVitoriano;

public class VitorianoFactory implements AbstractFactory {
    @Override
    public CadeiraInterface criarCadeira() {
        return new CadeiraVitoriano();
    }

    @Override
    public MesaDeCentroInterface criarMesaDeCentro() {
        return new MesaVitoriano();
    }

    @Override
    public SofaInterface criarSofa() {
        return new SofaVitoriano();
    }
}
