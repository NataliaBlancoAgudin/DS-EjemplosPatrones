package creacion.abstractFactory.factorias;

import creacion.abstractFactory.bloqueInterrogante.BloqueInterrogante;
import creacion.abstractFactory.bloqueInterrogante.NintendoDSBloqueInterrogante;
import creacion.abstractFactory.moneda.Moneda;
import creacion.abstractFactory.moneda.NintendoDSMoneda;

public class NintendoDSItemFactory implements AbstractFactory{

    @Override
    public BloqueInterrogante createBloqueInterrogante() {
        return new NintendoDSBloqueInterrogante();
    }

    @Override
    public Moneda createMoneda() {
        return new NintendoDSMoneda();
    }
}
