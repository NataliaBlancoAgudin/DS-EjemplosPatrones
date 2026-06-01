package comportamiento.templateMethod.levels;

public class FireLevel extends GameLevel {

    @Override
    protected void loadResources() {
        System.out.println("🔥 Cargando texturas de lava...");
    }

    @Override
    protected void loadEnemies() {
        System.out.println("👹 Creando Goblins de fuego...");
    }
}
