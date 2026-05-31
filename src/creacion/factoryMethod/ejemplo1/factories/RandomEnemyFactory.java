package creacion.factoryMethod.ejemplo1.factories;

import creacion.factoryMethod.ejemplo1.entities.Boo;
import creacion.factoryMethod.ejemplo1.entities.Enemy;
import creacion.factoryMethod.ejemplo1.entities.Goomba;
import creacion.factoryMethod.ejemplo1.entities.Koopa;

// CONCRETE_CREATOR: Clase concreta de la factoria que extiende de la clase abstracta EnemyFactory
public class RandomEnemyFactory extends EnemyFactory{

    /**
     * Metodo abstracto de la clase abstracta EnemyFactory implementado para que devuelva un Boo
     */
    @Override
    public Enemy createEnemy() {
        int randomNum = (int)(Math.random()*100);

        if(randomNum > 66)
            return new Boo();
        else if (randomNum > 33)
            return new Goomba();
        else
            return new Koopa();
    }
}
