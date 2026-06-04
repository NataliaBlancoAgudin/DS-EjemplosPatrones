package creacion.prototype;

import creacion.prototype.prototipos.Enemigo;
import creacion.prototype.prototipos.Goblin;

public class Main {

    public static void main(String[] args){
        // 1. Creamos los prototipos una vez
        Goblin goblinGuerrero = new Goblin("Guerrero", 150, "Espada de Hierro");
        Goblin goblinMago = new Goblin("Mago", 80, "Bastón mágico");

        // 2. CREAMOS LOS SPAWNERS parametrizados con su prototipo
        // Un spawner para guerreros y otro para magos
        Spawner spawnerGuerreros = new Spawner(goblinGuerrero);
        Spawner spawnerMagos = new Spawner(goblinMago);

        System.out.println("=== EL JUGADOR ENTRA EN UNA MAZMORRA ===");

        // 3. ¡Invocamos a los enemigos usando el Spawner!
        // El Spawner se encarga de llamar internamente a .clonar()

        // Creamos los goblins clonados
        Enemigo goblinGuerreroClon1 = spawnerGuerreros.spawnEnemigo();
        Enemigo goblinGuerreroClon2 =  spawnerGuerreros.spawnEnemigo();
        Enemigo goblinMagoClon1 = spawnerMagos.spawnEnemigo();
        Enemigo goblinMagoClon2 = spawnerMagos.spawnEnemigo();

        // Hacemos una mutacion de ellos
        goblinGuerreroClon1.setArma("Hacha Gigante");
        goblinGuerreroClon2.setArma("Arco con flechas");

        goblinMagoClon1.setArma("Hada maléfica");
        goblinMagoClon2.setArma("Veneno");
        goblinMagoClon2.setVida(200);

        goblinGuerrero.atacar();
        goblinGuerreroClon1.atacar();
        goblinGuerreroClon2.atacar();
        goblinMago.atacar();
        goblinMagoClon1.atacar();
        goblinMagoClon2.atacar();
    }
}
