package creacion.factoryMethod;

import creacion.factoryMethod.factories.*;

public class Main {

    public static void main(String[] args) {
//        System.out.println("=== CONFIGURACIÓN 1: Modo Solo Boos ===");
//
//        EnemyFactory factoryBoos = new BooFactory();
//
//        Game gameOnlyBoos = new Game(factoryBoos);
//
//        gameOnlyBoos.game();
//
//        System.out.println("=== CONFIGURACIÓN 2: Modo Solo Goombas ===");
//
//        EnemyFactory factoryGoombas = new GoombaFactory();
//
//        Game gameOnlyGoombas = new Game(factoryGoombas);
//
//        gameOnlyGoombas.game();
//
//        System.out.println("=== CONFIGURACIÓN 3: Modo Solo Koopas ===");
//
//        EnemyFactory factoryKoopas = new KoopaFactory();
//
//        Game gameOnlyKoopas = new Game(factoryKoopas);
//
//        gameOnlyKoopas.game();

        System.out.println("=== CONFIGURACIÓN 4: Modo Random ===");

        EnemyFactory factoryRandom = new RandomEnemyFactory();

        Game randomEnemiesGame = new Game(factoryRandom);

        randomEnemiesGame.game();
    }
}