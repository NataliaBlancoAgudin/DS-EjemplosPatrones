package comportamiento.templateMethod.levels;

public abstract class GameLevel {

    /**
     * TEMPLATE METHOD.
     * 1. Pantalla de carga
     * 2. Cargar recursos
     * 3. Cargar enemigos
     * 4. Hooks especiales (si los hay)
     * 5. Comenzar juego
     */
    public void loadLevel(){
        showLoadingScreen();
        loadResources();
        loadEnemies();
        hookSpecial();
        startGame();
        finishGame();
    }

    // MÉTODOS COMUNES - METODOS PRIVADOS DE LA CLASE
    private void showLoadingScreen(){
        System.out.println("⏳ Mostrando Loading Screen...");
    }

    private void startGame(){
        System.out.println("▶️ Iniciando música y juego.");
    }

    private void finishGame(){
        System.out.println("¡ENHORABUENA! Has completado el nivel.");
    }

    // MÉTODOS PRIMITIVOS (ABSTRACTOS)
    protected abstract void loadResources();
    protected abstract void loadEnemies();

    // OPERACIONES "DE ENGANCHE"
    protected void hookSpecial(){}
}
