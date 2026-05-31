package creacion.abstractFactory.factorias;

import creacion.abstractFactory.bloqueInterrogante.BloqueInterrogante;
import creacion.abstractFactory.bloqueInterrogante.GameBoyBloqueInterrogante;
import creacion.abstractFactory.moneda.GameBoyMoneda;
import creacion.abstractFactory.moneda.Moneda;

public class GameBoyItemFactory implements AbstractFactory{

    @Override
    public BloqueInterrogante createBloqueInterrogante() {
        return new GameBoyBloqueInterrogante();
    }

    @Override
    public Moneda createMoneda() {
        return new GameBoyMoneda();
    }
}
