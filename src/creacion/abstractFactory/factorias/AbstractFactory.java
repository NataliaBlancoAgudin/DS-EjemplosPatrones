package creacion.abstractFactory.factorias;

import creacion.abstractFactory.bloqueInterrogante.BloqueInterrogante;
import creacion.abstractFactory.moneda.Moneda;

public interface AbstractFactory {
    BloqueInterrogante createBloqueInterrogante();
    Moneda createMoneda();
}
