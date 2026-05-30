package creacion.factoryMethod;

import creacion.factoryMethod.factories.EnemyFactory;

// CLIENT: Clase cliente que usa las factorias. Deja que el main decida cual es la factoria que quiere utilizar,
// para que decida el modo de juego que prefiera
public class Game {

    private EnemyFactory enemyFactory;

    public Game(EnemyFactory enemyFactory){
        this.enemyFactory = enemyFactory;
    }

    public void game(){
        this.enemyFactory.spawnEnemy();
    }
}
