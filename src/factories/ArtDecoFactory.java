package factories;

import interfaces.AbstractFactory;
import interfaces.CadeiraInterface;
import interfaces.MesaDeCentroInterface;
import interfaces.SofaInterface;
import interfaces.art_deco.CadeiraArtDeco;
import interfaces.art_deco.MesaArtDeco;
import interfaces.art_deco.SofaArtDeco;

public class ArtDecoFactory implements AbstractFactory {
    @Override
    public CadeiraInterface criarCadeira() {
        return new CadeiraArtDeco();
    }

    @Override
    public MesaDeCentroInterface criarMesaDeCentro() {
        return new MesaArtDeco();
    }

    @Override
    public SofaInterface criarSofa() {
        return new SofaArtDeco();
    }
}
