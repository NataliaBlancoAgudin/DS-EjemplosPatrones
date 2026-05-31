package creacion.factoryMethod.ejemplo1.factories;

import creacion.factoryMethod.ejemplo1.entities.Enemy;

// CREATOR. Clase Abstracta EnemyFactory. Es la clase abstracta que extenderan todas las factorias
public abstract class EnemyFactory {

    /**
     * Metodo que siempre hará lo mismo cuando aparezca un enemigo
     * 1. Mensaje de que ha aparecido
     * 2. Crear el enemigo
     * 3. Mensaje de aplastarlo
     */
    public void spawnEnemy(){
        System.out.println("Oh no! Ha aparecido un enemigo...");

        Enemy enemy = createEnemy();
        enemy.updateLogic();

        System.out.println("Hay que aplastarlo!");
    }

    /**
     * Metodo abstracto que implementaran las factorias, creando los enemigos como ellas crean que hay que crearlo
     */
    public abstract Enemy createEnemy();
}
