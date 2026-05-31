package creacion.abstractFactory;

import creacion.abstractFactory.bloqueInterrogante.BloqueInterrogante;
import creacion.abstractFactory.factorias.AbstractFactory;
import creacion.abstractFactory.moneda.Moneda;

public class LevelEditor {

    private AbstractFactory abstractFactory;

    public LevelEditor(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void renderLevel(){
        BloqueInterrogante bloque = this.abstractFactory.createBloqueInterrogante();
        Moneda moneda = this.abstractFactory.createMoneda();

        bloque.spawnItem();
        moneda.spawnItem();
    }
}
