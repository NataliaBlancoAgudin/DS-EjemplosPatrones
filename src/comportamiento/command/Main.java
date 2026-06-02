package comportamiento.command;

public class Main {

    public static void main(String[] args) {
        // El Main solo instancia el juego y lo arranca
        Game miJuego = new Game();
        miJuego.init();
    }
}
