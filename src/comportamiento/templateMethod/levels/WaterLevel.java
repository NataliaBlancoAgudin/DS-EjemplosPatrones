package comportamiento.templateMethod.levels;

public class WaterLevel extends GameLevel {
    @Override
    protected void loadResources() {
        System.out.println("💧 Cargando texturas de agua...");
    }
    @Override
    protected void loadEnemies() {
        System.out.println("🐧 Creando Pingüinos mutantes...");
    }

    @Override
    protected void hookSpecial() {
        System.out.println("🌊 Aplicando efecto de burbujas en pantalla.");
    }
}
