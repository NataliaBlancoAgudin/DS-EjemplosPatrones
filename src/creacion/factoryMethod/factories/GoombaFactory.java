package creacion.factoryMethod.factories;

import creacion.factoryMethod.entities.Enemy;
import creacion.factoryMethod.entities.Goomba;

// CONCRETE_CREATOR: Clase concreta de la factoria que extiende de la clase abstracta EnemyFactory
public class GoombaFactory extends EnemyFactory {

    /**
     * Metodo abstracto de la clase abstracta EnemyFactory implementado para que devuelva un Boo
     */
    @Override
    public Enemy createEnemy() {
        return new Goomba();
    }
}
