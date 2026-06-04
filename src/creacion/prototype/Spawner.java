package creacion.prototype;

import creacion.prototype.prototipos.Enemigo;

public class Spawner {
    private final Enemigo enemigo;

    public Spawner(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    public Enemigo spawnEnemigo(){
        return enemigo.clonar();
    }
}
