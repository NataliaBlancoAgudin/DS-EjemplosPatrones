package creacion.factoryMethod.factories;

import creacion.factoryMethod.entities.Enemy;
import creacion.factoryMethod.entities.Koopa;

// CONCRETE_CREATOR: Clase concreta de la factoria que extiende de la clase abstracta EnemyFactory
public class KoopaFactory extends EnemyFactory{

    /**
     * Metodo abstracto de la clase abstracta EnemyFactory implementado para que devuelva un Boo
     */
    @Override
    public Enemy createEnemy() {
        return new Koopa();
    }
}
