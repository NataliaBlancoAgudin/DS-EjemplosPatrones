package creacion.factoryMethod.factories;

import creacion.factoryMethod.entities.Boo;
import creacion.factoryMethod.entities.Enemy;

// CONCRETE_CREATOR: Clase concreta de la factoria que extiende de la clase abstracta EnemyFactory
public class BooFactory extends EnemyFactory{

    /**
     * Metodo abstracto de la clase abstracta EnemyFactory implementado para que devuelva un Boo
     */
    @Override
    public Enemy createEnemy() {
        return new Boo();
    }
}
